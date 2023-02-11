package com.wa7a.MVVMSimpleDesign.ui

import android.view.LayoutInflater
import android.widget.Toast
import com.wa7a.MVVMSimpleDesign.databinding.ActivityMainBinding
import com.wa7a.MVVMSimpleDesign.data.model.User
import com.wa7a.MVVMSimpleDesign.data.model.Wisdom

class MainActivity() : BaseActivity<ActivityMainBinding>() {
    override val LOG_TAG: String = "MainActivity"
    override val bindingInflator: (LayoutInflater) -> ActivityMainBinding =
        ActivityMainBinding::inflate

    private val presenter = MainPresenter(this)
    override fun setup() {
        presenter.getUserInfo()
        presenter.getWisdom()
    }

    override fun onUserInfoSuccess(user: User) {
        binding?.textUserName?.text = user.name
    }

    override fun onWisdomCallSuccess(wisdom: Wisdom) {
        binding?.textContent?.text = "${wisdom.quote}"
        binding?.textAuthor?.text = "By ${wisdom.author}"

    }

    override fun callback() {
            binding?.buttonFetchData?.setOnClickListener{
                Toast.makeText(this,"Clicked!",Toast.LENGTH_SHORT).show()
                presenter.getWisdom()
            }
        }


}