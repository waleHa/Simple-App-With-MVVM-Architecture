package com.wa7a.mvvmapp.ui

import com.wa7a.mvvmapp.R
import com.wa7a.mvvmapp.databinding.ActivityMainBinding

class MainActivity() : BaseActivity<ActivityMainBinding>() {
    override val layoutId: Int = R.layout.activity_main
    override fun setup() {
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
    }
}