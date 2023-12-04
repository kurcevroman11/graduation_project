package com.example.taskmaster.data.network.di

import com.example.taskmaster.data.network.client.Token
import com.example.taskmaster.data.network.createHttpClient
import org.koin.core.module.Module
import org.koin.dsl.module

val networkModule: (enableLogging: Boolean) -> Module get() = { enableLogging ->
    module {
        single { createHttpClient(enableLogging) }
        single { Token(httpClient = get()) }
    }
}