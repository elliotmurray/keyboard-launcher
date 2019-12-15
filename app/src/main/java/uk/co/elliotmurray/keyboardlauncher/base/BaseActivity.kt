package uk.co.elliotmurray.keyboardlauncher.base

import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable
import org.koin.androidx.viewmodel.ext.android.viewModel

abstract class BaseActivity<VB: ViewBinding>: AppCompatActivity() {
    private val compositeDisposable = CompositeDisposable()

    lateinit var binding: VB

    abstract fun createBinding(layoutInflater: LayoutInflater): VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = createBinding(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    override fun onResume() {
        super.onResume()
        observeViewModel()
    }

    override fun onPause() {
        super.onPause()
        compositeDisposable.clear()
    }

    fun Disposable.autoDispose() {
        compositeDisposable.add(this)
    }

    open fun initViews() {}
    open fun observeViewModel() {}
}