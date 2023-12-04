package com.example.taskmaster.data.network.client

import com.example.taskmaster.data.network.ApiService
import com.example.taskmaster.data.network.NetworkConstants
import com.example.taskmaster.data.network.models.AccessTokenDto
import com.mocoding.pokedex.core.network.helper.handleErrors
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.http.ContentType
import io.ktor.http.contentType

class Token (
    private val httpClient: HttpClient
) : ApiService {
    override suspend fun fetchUserToken(): AccessTokenDto? {
        return handleErrors {
            httpClient.get(NetworkConstants.Login.route) {
                contentType(ContentType.Application.Json)
            }
        }
    }
}
