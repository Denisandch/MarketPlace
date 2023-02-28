package com.example.domain.usecase

import com.example.domain.model.FlashSale
import com.example.domain.repository.Repository
import com.example.domain.usecase.datasource.DataSource

class DownloadFlashSaleUseCase(
    private val repository: Repository
) : DataSource<List<FlashSale>> {
    override suspend fun getData(identification: Int): List<FlashSale> {
        return repository.downloadFlashSaleList()
    }
}