package uk.co.elliotmurray.keyboardlauncher

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import io.reactivex.rxjava3.core.Observable
import kotlinx.coroutines.test.withTestContext

class Repository(val context: Context): IRepository {
    override fun getInstalledApplications(): Observable<List<LauncherItem>> {
        //TODO: somehow update this when apps get installed/uninstalled
        //TODO: ..also should probs cache this for better performance
        return Observable.just(fetchInstalledApps())
    }

    private fun fetchInstalledApps(): List<LauncherItem> {
        return context.packageManager.getInstalledApplications(PackageManager.GET_META_DATA)
            .map {
                LauncherItem(
                    it.name ?: "",
                    it.packageName
                )
            }
    }
}