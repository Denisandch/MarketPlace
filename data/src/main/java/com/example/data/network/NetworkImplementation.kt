package com.example.data.network

import com.example.data.network.model.DescriptionData
import com.example.data.network.model.FlashSaleData
import com.example.data.network.model.LatestData
import com.example.data.network.retrofit.RetrofitInstance

class NetworkImplementation: Network {
    override suspend fun downloadLatest(): List<LatestData> {
        return RetrofitInstance.retrofitService.getLatest()
    }

    override suspend fun downloadFlash(): List<FlashSaleData> {
        return RetrofitInstance.retrofitService.getFlashSale()
    }

    override suspend fun downloadDescription(): DescriptionData {
        return RetrofitInstance.retrofitService.getDescription()
    }
}