package com.example.data.storage

interface Storage {
    //TODO STORAGE methods
    suspend fun get1()
    suspend fun clear()
    suspend fun save()
}