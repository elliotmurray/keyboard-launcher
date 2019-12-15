package uk.co.elliotmurray.keyboardlauncher

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.subjects.BehaviorSubject
import uk.co.elliotmurray.keyboardlauncher.base.BaseViewModel
import uk.co.elliotmurray.keyboardlauncher.ext.combineLatestPair

interface ILauncherInputs {
    fun searchTermUpdated(search: String)
}

interface ILauncherOutputs {
    fun items(): Observable<List<LauncherItem>>
}

class LauncherViewModel(val repo: IRepository) : BaseViewModel(), ILauncherInputs,
    ILauncherOutputs {
    val inputs: ILauncherInputs = this
    val outputs: ILauncherOutputs = this

    private val bsSearchTerm = BehaviorSubject.createDefault<String>("")

    override fun searchTermUpdated(search: String) {
        bsSearchTerm.onNext(search)
    }

    override fun items(): Observable<List<LauncherItem>> = repo
        .getInstalledApplications()
        .map { launcherItem -> launcherItem.sortedBy { it.appName } }
        .combineLatestPair(bsSearchTerm)
        .map { (items, searchTerm) ->
            items.filter {
                it.appName.matches(Regex.fromLiteral(".*${searchTerm.toCharArray().joinToString(".*")}.*"))
            }
        }
        .distinctUntilChanged()
}