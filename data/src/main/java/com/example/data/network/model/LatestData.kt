package com.example.data.network.model

import com.squareup.moshi.Json

data class LatestData(
    val category: String,
    val name: String,
    val price: Double,
    @Json(name = "image_url") val imageUrl: String
)
