package com.example.taskmaster.data.data_sources

import com.example.taskmaster.core.database.AccessTokenEntity
import com.example.taskmaster.data.cache.sqldelight.AccessTokenDao
import com.vickikbt.devtyme.data.mappers.toDomain
import com.example.taskmaster.data.mappers.toEntity
import com.example.taskmaster.data.network.ApiService
import com.vickikbt.devtyme.domain.models.AccessToken
import com.vickikbt.devtyme.domain.repositories.AuthRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class AuthRepositoryImpl constructor(
    private val apiService: ApiService,
    private val accessTokenDao: AccessTokenDao
) : AuthRepository {

    override suspend fun fetchUserToken(code: String) {
        val accessTokenDto = apiService.fetchUserToken()
        val responseEntity = accessTokenDto?.toEntity()

        saveUserToken(accessToken = responseEntity!!)
    }

    override suspend fun saveUserToken(accessToken: AccessTokenEntity) =
        accessTokenDao.saveToken(accessTokenEntity = accessToken)

    override suspend fun deleteUserToken() = accessTokenDao.deleteToken()
}
