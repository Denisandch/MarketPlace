package com.example.domain.usecase.datasource

interface DataSource<T> {
    suspend fun getData(identification: Int = -1): T
}