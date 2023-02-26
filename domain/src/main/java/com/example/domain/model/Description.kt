package com.example.domain.model

data class Description(
    val name: String,
    val description: String,
    val rating: Double,
    val reviewsCount: Int,
    val price: Double,
    val colors: List<String>
)
