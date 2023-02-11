package com.wa7a.MVVMSimpleDesign.data.repository

import com.wa7a.MVVMSimpleDesign.data.api.FakeApiService


class WisdomRepository {
    private val api = FakeApiService()

    fun getAWisdom() = api.getRandomWisdom()
}