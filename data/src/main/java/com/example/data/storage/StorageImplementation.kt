package com.example.data.storage

import android.content.Context
import com.example.data.storage.database.UserDatabase
import com.example.data.storage.model.UserData

class StorageImplementation(
    private val context: Context
) : Storage {

    private val userDao = UserDatabase.getDatabase(context).userDao()
    override suspend fun saveUser(userData: UserData) {
        userDao.saveUser(userData)
    }

    override suspend fun getUser(name: String): UserData? {
        return userDao.getUser(name)
    }
}