package com.wa7a.MVVMSimpleDesign.ui

import com.wa7a.MVVMSimpleDesign.data.repository.UserRepository
import com.wa7a.MVVMSimpleDesign.data.repository.WisdomRepository

class MainPresenter(private val viewInterface: IMainView) {
    val userRepository = UserRepository()
    val wisdomRepository = WisdomRepository()


    fun getUserInfo() {
        viewInterface.onUserInfoSuccess(userRepository.getCurrentUser())
    }

    fun getWisdom() {
        viewInterface.onWisdomCallSuccess(wisdomRepository.getAWisdom())
    }


}