package com.example.domain.model

data class FlashSale(
    val category: String,
    val name: String,
    val price: Double,
    val discount: Int,
    val imageUrl: String
)
