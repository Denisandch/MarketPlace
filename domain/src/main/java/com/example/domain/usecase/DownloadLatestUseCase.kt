package com.example.domain.usecase

import com.example.domain.model.Latest
import com.example.domain.repository.Repository
import com.example.domain.usecase.datasource.DataSource

class DownloadLatestUseCase(
    private val repository: Repository
) : DataSource<List<Latest>> {
    override suspend fun getData(identification: Int): List<Latest> {
       return repository.downloadLatestList()
    }
}