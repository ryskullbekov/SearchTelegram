package com.example.searchtelegram.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    @Query("SELECT * FROM person_table ORDER BY id ASC")
    fun readData(): Flow<List<User>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertData(person: User)

    @Query("SELECT * FROM person_table WHERE Name LIKE :searchQuery OR Times LIKE :searchQuery")
    fun searchDatabase(searchQuery: String): Flow<List<User>>

}