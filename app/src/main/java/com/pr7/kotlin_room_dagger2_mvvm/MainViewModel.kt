package com.pr7.kotlin_room_dagger2_mvvm

import androidx.lifecycle.ViewModel
import com.pr7.kotlin_room_dagger2_mvvm.data.MainRepository

class MainViewModel constructor(
    val mainRepository: MainRepository=MainRepository()
):ViewModel() {


    fun insertnewUser(user: User){
        mainRepository.insertData(user)
    }
}