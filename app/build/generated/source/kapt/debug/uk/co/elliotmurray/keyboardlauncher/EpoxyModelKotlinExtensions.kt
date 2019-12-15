@file:Suppress("DEPRECATION")

package uk.co.elliotmurray.keyboardlauncher

import com.airbnb.epoxy.EpoxyController
import kotlin.Suppress
import kotlin.Unit

inline fun EpoxyController.launcher(modelInitializer: LauncherBindingModelBuilder.() -> Unit) {
    LauncherBindingModel_().apply {
        modelInitializer()
    }
    .addTo(this)
}
