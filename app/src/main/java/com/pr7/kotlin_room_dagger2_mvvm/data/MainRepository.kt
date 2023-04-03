package com.pr7.kotlin_room_dagger2_mvvm.data

import com.pr7.kotlin_room_dagger2_mvvm.User
import com.pr7.kotlin_room_dagger2_mvvm.UserDao
import com.pr7.kotlin_room_dagger2_mvvm.di.Injector
import javax.inject.Inject

class MainRepository {

    @Inject
    lateinit var userDao: UserDao

    init {
        Injector.appComponent.inject(this)
    }

    fun insertData(user: User){
        userDao.insertUser(user)
    }
}