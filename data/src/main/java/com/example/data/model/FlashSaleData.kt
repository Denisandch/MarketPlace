package com.example.data.model

import com.squareup.moshi.Json

data class FlashSaleData(
    val category: String,
    val name: String,
    val price: Double,
    val discount: Int,
    @Json(name = "image_url") val imageUrl: String
)
