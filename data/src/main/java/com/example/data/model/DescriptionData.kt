package com.example.data.model

import com.squareup.moshi.Json

data class DescriptionData(
    val name: String,
    val description: String,
    val rating: Double,
    @Json(name = "number_of_reviews") val reviewsCount: Int,
    val price: Double,
    val colors: List<String>
)