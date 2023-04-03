package com.pr7.kotlin_room_dagger2_mvvm.di

import android.content.Context
import androidx.room.Room
import com.pr7.kotlin_room_dagger2_mvvm.AppDatabase
import com.pr7.kotlin_room_dagger2_mvvm.Constants
import com.pr7.kotlin_room_dagger2_mvvm.User
import com.pr7.kotlin_room_dagger2_mvvm.UserDao
import dagger.Module
import dagger.Provides


@Module
class AppModule constructor(
    val context: Context
) {


    @Provides
    fun provideUserDao(appDatabase: AppDatabase):UserDao{
        return appDatabase.userDao()
    }

    @Provides
    fun provvideAppDatabase():AppDatabase{
        val db = Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java, "${Constants.TABLE_NAMEE}"
        ).allowMainThreadQueries().build()

        return db
    }

}