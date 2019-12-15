package uk.co.elliotmurray.keyboardlauncher

import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    single<IRepository> { Repository(androidContext()) }

    viewModel { LauncherViewModel(get()) }
}