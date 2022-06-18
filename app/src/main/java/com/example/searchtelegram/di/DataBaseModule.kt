package com.example.searchtelegram.di

import android.content.Context
import androidx.room.Room
import com.example.searchtelegram.data.UserDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        UserDataBase::class.java,
        "person_database"
    ).build()

    @Singleton
    @Provides
    fun provideDao(database: UserDataBase) = database.UserDao()

}