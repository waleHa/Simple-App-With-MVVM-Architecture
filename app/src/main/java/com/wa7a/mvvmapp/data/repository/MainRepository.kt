package com.wa7a.mvvmapp.data.repository

import com.wa7a.mvvmapp.data.api.FakeApiService
import com.wa7a.mvvmapp.data.database.FakeDatabase

class MainRepository {
    private val database = FakeDatabase()
    private val api = FakeApiService()

    fun getCurrentUser() = database.getCurrentUser()
    fun getAWisdom() = api.getRandomWisdom()
}