package uk.co.elliotmurray.keyboardlauncher

import com.airbnb.epoxy.EpoxyController

class LauncherEpoxyController : EpoxyController() {
    var items: List<LauncherItem> = emptyList()
        set(value) {
            field = value
            requestModelBuild()
        }

    override fun buildModels() {
        items.forEach { launcherItem ->
            launcher {
                id(launcherItem.packageName)
                appName(launcherItem.appName)
            }
        }
    }
}