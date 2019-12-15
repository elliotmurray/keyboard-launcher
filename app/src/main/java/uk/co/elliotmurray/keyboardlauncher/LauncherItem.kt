package uk.co.elliotmurray.keyboardlauncher

import android.graphics.drawable.Drawable
import io.reactivex.rxjava3.core.Observable

data class LauncherItem(
    val appName: String,
    val packageName: String
)