package com.example.data.network

import com.example.data.model.DescriptionData
import com.example.data.model.FlashSaleData
import com.example.data.model.LatestData

interface Network {
    suspend fun downloadLatest(): List<LatestData>

    suspend fun downloadFlash(): List<FlashSaleData>

    suspend fun downloadDescription(): DescriptionData
}