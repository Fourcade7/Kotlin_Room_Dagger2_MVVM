package com.pr7.kotlin_room_dagger2_mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import com.pr7.kotlin_room_dagger2_mvvm.Constants.TABLE_NAMEE
import com.pr7.kotlin_room_dagger2_mvvm.di.AppModule
import com.pr7.kotlin_room_dagger2_mvvm.di.DaggerAppComponent
import com.pr7.kotlin_room_dagger2_mvvm.di.Injector
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainViewModel=ViewModelProvider(this@MainActivity).get(MainViewModel::class.java)
        mainViewModel.insertnewUser(User(uid = 9760, name = "Susie Uzb"))





    }
}