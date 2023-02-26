package com.example.data.storage.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.data.storage.model.UserData

@Dao
interface UserDao {

    //TODO correct SQL queries

    @Insert()
    suspend fun saveUser(user: UserData)

    @Query("select * from user where name = name")
    suspend fun getUser(name: String): UserData
}