package com.wa7a.MVVMSimpleDesign.data.repository

import com.wa7a.MVVMSimpleDesign.data.database.FakeDatabase

class UserRepository {
    private val database = FakeDatabase()

    fun getCurrentUser() = database.getCurrentUser()
}