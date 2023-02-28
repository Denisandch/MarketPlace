package com.example.domain.usecase

import com.example.domain.model.User
import com.example.domain.repository.Repository

class SignInUseCase(
    private val repository: Repository
) {
    suspend fun registerUser(user: User) {
        if (repository.searchUser(user.name) != null) {
            repository.registerUser(user)
        }
    }
}