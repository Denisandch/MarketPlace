package com.example.domain.usecase

import com.example.domain.model.Description
import com.example.domain.repository.Repository
import com.example.domain.usecase.datasource.DataSource

class DownloadDescriptionUseCase(
    private val repository: Repository
) : DataSource<Description> {
    override suspend fun getData(identification: Int): Description {
        return repository.downloadDescription()
    }
}