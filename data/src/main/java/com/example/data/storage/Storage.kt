package com.example.data.storage

import com.example.data.storage.model.UserData

interface Storage {

    suspend fun saveUser(userData: UserData)

    suspend fun getUser(name: String): UserData?

}