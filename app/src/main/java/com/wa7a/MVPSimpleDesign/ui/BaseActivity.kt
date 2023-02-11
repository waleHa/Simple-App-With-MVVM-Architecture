package com.wa7a.MVVMSimpleDesign.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB: ViewBinding>:AppCompatActivity(), IMainView {
    abstract val LOG_TAG:String

    abstract val bindingInflator: (LayoutInflater) -> VB

    protected lateinit var binding: VB


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = bindingInflator(layoutInflater)
        setContentView(requireNotNull(binding).root)
        setup()
        callback()
    }

    abstract fun callback()

    abstract fun setup()


    protected fun log(value:String){
        Log.v(LOG_TAG,value)
    }
}