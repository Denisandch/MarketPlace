package com.example.domain.usecase

import com.example.domain.model.User
import com.example.domain.repository.Repository

class LogInUseCase(
    private val repository: Repository
) {
    suspend fun isExist(user: User) {
        repository.searchUser(user.name)
    }


}