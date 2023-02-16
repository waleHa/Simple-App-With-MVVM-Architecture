package com.wa7a.mvvmapp.data.database

import com.wa7a.mvvmapp.data.model.User

class FakeDatabase {
    fun getCurrentUser(): User {
        return User("Ahmed Ali",1992,"https://images.unsplash.com/photo-1610186593977-82a3e3696e7f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YnclMjBwb3J0cmFpdHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=600&q=60")
    }
}