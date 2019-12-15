package uk.co.elliotmurray.keyboardlauncher

import io.reactivex.rxjava3.core.Observable

interface IRepository {
    fun getInstalledApplications(): Observable<List<LauncherItem>>
}