package com.example.data.storage.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.storage.model.UserData

@Dao
interface UserDao {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun saveUser(user: UserData)

    @Query(value = "select * from user where name = :name")
    suspend fun getUser(name: String): UserData?
}