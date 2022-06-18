package com.example.searchtelegram.data

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Repository @Inject constructor(
    private val personDao: UserDao
) {

    fun readData(): Flow<List<User>> {
        return personDao.readData()
    }

    suspend fun insertData(person: User) {
        personDao.insertData(person)
    }

    fun searchDatabase(searchQuery: String): Flow<List<User>> {
        return personDao.searchDatabase(searchQuery)
    }

}