package com.example.domain.repository

import com.example.domain.model.Description
import com.example.domain.model.FlashSale
import com.example.domain.model.Latest
import com.example.domain.model.User

interface Repository {
    suspend fun downloadLatestList(): List<Latest>

    suspend fun downloadFlashSaleList(): List<FlashSale>

    suspend fun downloadDescription(): Description

    suspend fun searchUser(name: String): User?

    suspend fun registerUser(user: User)
}