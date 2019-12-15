package uk.co.elliotmurray.keyboardlauncher

import android.view.LayoutInflater
import org.koin.androidx.viewmodel.ext.android.viewModel
import uk.co.elliotmurray.keyboardlauncher.base.BaseActivity
import uk.co.elliotmurray.keyboardlauncher.databinding.ActivityLauncherBinding

class LauncherActivity : BaseActivity<ActivityLauncherBinding>() {

    private val viewModel: LauncherViewModel by viewModel()
    private lateinit var launcherEpoxyController: LauncherEpoxyController

    override fun createBinding(layoutInflater: LayoutInflater): ActivityLauncherBinding = ActivityLauncherBinding.inflate(layoutInflater)

    override fun initViews() {
        launcherEpoxyController = LauncherEpoxyController()
        binding.ervLauncher.setController(launcherEpoxyController)
    }

    override fun observeViewModel() {
        viewModel.outputs.items()
            .subscribe { launcherItems ->
                launcherEpoxyController.items = launcherItems
            }
            .autoDispose()
    }

}
