package com.example.taskmaster.data.mappers

import com.example.taskmaster.core.database.AccessTokenEntity
import com.example.taskmaster.data.network.models.AccessTokenDto

internal fun AccessTokenDto.toEntity(): AccessTokenEntity {
    return AccessTokenEntity(
        accessToken = this.accessToken,
        refreshToken = this@toEntity.refreshToken,
        scope = this.scope,
        tokenType = this.tokenType,
        uid = this.uid,
    )
}
