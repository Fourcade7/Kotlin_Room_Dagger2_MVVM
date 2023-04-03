package com.pr7.kotlin_room_dagger2_mvvm.di

import com.pr7.kotlin_room_dagger2_mvvm.MainActivity
import com.pr7.kotlin_room_dagger2_mvvm.data.MainRepository
import dagger.Component


@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(mainActivity: MainActivity)
    fun inject(mainRepository: MainRepository)

}