package com.pr7.kotlin_room_dagger2_mvvm.di

import android.content.Context
import com.pr7.kotlin_room_dagger2_mvvm.UserDao

object Injector {


    lateinit var appComponent: AppComponent

    fun getAppComponent(context: Context):AppComponent{
        val appComponent=DaggerAppComponent.builder().appModule(AppModule(context)).build()
        return appComponent

    }
}