package com.pr7.kotlin_room_dagger2_mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.room.Room
import com.pr7.kotlin_room_dagger2_mvvm.Constants.TABLE_NAMEE
import com.pr7.kotlin_room_dagger2_mvvm.di.AppModule
import com.pr7.kotlin_room_dagger2_mvvm.di.DaggerAppComponent
import com.pr7.kotlin_room_dagger2_mvvm.di.Injector
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userDao: UserDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Injector.appComponent.inject(this)
       userDao.insertUser(User(uid = 5258000, name = "Harold Gilmore"))


    }
}