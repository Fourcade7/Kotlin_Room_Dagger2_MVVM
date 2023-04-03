package com.pr7.kotlin_room_dagger2_mvvm

import android.app.Application
import androidx.room.Room
import com.pr7.kotlin_room_dagger2_mvvm.di.Injector.appComponent
import com.pr7.kotlin_room_dagger2_mvvm.di.Injector.getAppComponent

class MyApp constructor():Application() {

    override fun onCreate() {
        super.onCreate()
       appComponent= getAppComponent(this)
    }


}