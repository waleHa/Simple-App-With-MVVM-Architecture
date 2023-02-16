package com.wa7a.mvvmapp.data.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wa7a.mvvmapp.data.model.User
import com.wa7a.mvvmapp.data.model.Wisdom
import com.wa7a.mvvmapp.data.repository.MainRepository

class MainViewModel() : ViewModel() {
    private val repository = MainRepository()

    private var _currentUser = MutableLiveData<User>()
    var currentUser: LiveData<User> = _currentUser

    private var _wisdom = MutableLiveData<Wisdom>()
    val wisdm: LiveData<Wisdom> = _wisdom

    private var _loading = MutableLiveData<Boolean>()
    val loading: LiveData<Boolean> = _loading

    init {
        _loading.postValue(true)
        getUserInfo()
        getWisdom()
        _loading.postValue(false)
    }

    fun getUserInfo() {
        _currentUser.postValue(repository.getCurrentUser())
    }

    fun getWisdom() {
        _wisdom.postValue(repository.getAWisdom())
    }


}