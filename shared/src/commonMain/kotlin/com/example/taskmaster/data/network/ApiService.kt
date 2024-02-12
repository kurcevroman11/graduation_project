package com.example.taskmaster.data.network

import com.example.taskmaster.data.network.models.AccessTokenDto

interface ApiService {
    suspend fun fetchUserToken(login: String, password: String): AccessTokenDto?
}
