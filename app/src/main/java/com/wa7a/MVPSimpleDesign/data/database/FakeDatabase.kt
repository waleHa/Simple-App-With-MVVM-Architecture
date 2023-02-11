package com.wa7a.MVVMSimpleDesign.data.database

import com.wa7a.MVVMSimpleDesign.data.model.User

class FakeDatabase {
    fun getCurrentUser(): User {
        return User("Ahmed Ali",1992)
    }
}