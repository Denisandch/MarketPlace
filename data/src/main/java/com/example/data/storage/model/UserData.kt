package com.example.data.storage.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class UserData(
    @PrimaryKey(autoGenerate = false) val name: String,
    val lastName: String,
    val email: String
)
