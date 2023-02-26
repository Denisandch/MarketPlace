package com.example.data.network

import com.example.data.network.model.DescriptionData
import com.example.data.network.model.FlashSaleData
import com.example.data.network.model.LatestData
import com.example.data.network.retrofit.URL
import retrofit2.http.GET

interface ConnectionApi {

    @GET(URL.LatestEndPoint)
    suspend fun getLatest(): List<LatestData>

    @GET(URL.FlashEndPoint)
    suspend fun getFlashSale(): List<FlashSaleData>

    @GET(URL.DescriptionEndPoint)
    suspend fun getDescription(): DescriptionData
}