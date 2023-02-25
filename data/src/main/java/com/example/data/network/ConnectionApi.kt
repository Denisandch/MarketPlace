package com.example.data.network

import retrofit2.http.GET

interface ConnectionApi {

    //TODO rename, update methods

    @GET()
    suspend fun getList()

    @GET()
    suspend fun getList2()

    @GET()
    suspend fun getDsscription()
}