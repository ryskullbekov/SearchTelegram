package com.example.searchtelegram.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [User::class],
    version = 1,
    exportSchema = false
)
abstract class UserDataBase: RoomDatabase() {

    abstract fun UserDao(): UserDao

}