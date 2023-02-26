package com.example.data

import com.example.data.extensions.*
import com.example.data.network.Network
import com.example.data.storage.Storage
import com.example.domain.model.Description
import com.example.domain.model.FlashSale
import com.example.domain.model.Latest
import com.example.domain.model.User
import com.example.domain.repository.Repository

class RepositoryImplementation(
    private val network: Network,
    private val storage: Storage
): Repository {
    override suspend fun downloadLatestList(): List<Latest> {
        return network.downloadLatest().mapListLatestToDomain()
    }

    override suspend fun downloadFlashSaleList(): List<FlashSale> {
        return network.downloadFlash().mapListFlashToDomain()
    }

    override suspend fun downloadDescription(): Description {
        return network.downloadDescription().mapDataDescriptionToDomain()
    }

    override suspend fun searchUser(name: String): User {
        return storage.getUser(name).mapDataUserToDomain()
    }

    override suspend fun registerUser(user: User) {
        storage.saveUser(user.mapDomainUserToData())
    }
}