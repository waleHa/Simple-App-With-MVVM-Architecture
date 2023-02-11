package com.wa7a.MVVMSimpleDesign.ui

import com.wa7a.MVVMSimpleDesign.data.model.User
import com.wa7a.MVVMSimpleDesign.data.model.Wisdom

interface IMainView {
    fun onUserInfoSuccess(user: User)
    fun onWisdomCallSuccess(wisdom: Wisdom)
}