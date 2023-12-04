package com.vickikbt.devtyme.domain.repositories

import com.example.taskmaster.core.database.AccessTokenEntity
import com.vickikbt.devtyme.domain.models.AccessToken
import kotlinx.coroutines.flow.Flow

interface AuthRepository {

    suspend fun fetchUserToken(code: String)

    suspend fun saveUserToken(accessToken: AccessTokenEntity)

    suspend fun deleteUserToken()

}
