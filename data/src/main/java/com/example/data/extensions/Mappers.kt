package com.example.data.extensions

import com.example.data.network.model.DescriptionData
import com.example.data.network.model.FlashSaleData
import com.example.data.network.model.LatestData
import com.example.data.storage.model.UserData
import com.example.domain.model.Description
import com.example.domain.model.FlashSale
import com.example.domain.model.Latest
import com.example.domain.model.User

fun LatestData.mapDataLatestToDomain() = Latest(
    category = category,
    name = name,
    price = price,
    imageUrl = imageUrl
)

fun FlashSaleData.mapDataFlashToDomain() = FlashSale(
    category = category,
    name = name,
    price = price,
    discount = discount,
    imageUrl = imageUrl
)

fun DescriptionData.mapDataDescriptionToDomain() = Description(
    name = name,
    description = description,
    rating = rating,
    reviewsCount = reviewsCount,
    price = price,
    colors = colors
)

fun UserData.mapDataUserToDomain() = User(
    name = name,
    lastName = lastName,
    email = email
)

fun User.mapDomainUserToData() = UserData(
    name = name,
    lastName = lastName,
    email = email
)

fun List<LatestData>.mapListLatestToDomain(): List<Latest> {
    val buffer = mutableListOf<Latest>()

    for (lot in this) {
        buffer.add(lot.mapDataLatestToDomain())
    }

    return buffer
}

fun List<FlashSaleData>.mapListFlashToDomain(): List<FlashSale> {
    val buffer = mutableListOf<FlashSale>()

    for (lot in this) {
        buffer.add(lot.mapDataFlashToDomain())
    }

    return buffer
}