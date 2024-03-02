package com.example.taskmaster.data.network

import com.example.taskmaster.data.network.models.AccessTokenDto
import com.example.taskmaster.data.network.models.TaskDTO
import io.ktor.client.*
import io.ktor.client.call.body
import io.ktor.client.call.receive

import io.ktor.client.plugins.ClientRequestException
import io.ktor.client.plugins.RedirectResponseException
import io.ktor.client.plugins.ServerResponseException
import io.ktor.client.request.*
import io.ktor.client.request.forms.*
import io.ktor.client.statement.HttpResponse
import io.ktor.http.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

@Serializable
data class LoginRequest(val login: String, val password: String)

class ApiServiceImpl constructor(private val httpClient: HttpClient) : ApiService {

    // Запрос на получение токена
    override suspend fun fetchUserToken(login: String, password: String): AccessTokenDto? {
        return try {
            val response: HttpResponse = httpClient.post("https://c937-176-59-81-68.ngrok-free.app/login") {
                contentType(ContentType.Application.Json)
                setBody(LoginRequest(login, password))
            }
            if (response.status.isSuccess()) {
                response.body<AccessTokenDto>()
            } else {
                println("Server returned error status: ${response.status}")
                null
            }
        } catch (e: ServerResponseException) {
            println("500 error: ${e.message}")
            null
        } catch (e: ClientRequestException) {
            println("400 error: ${e.message}")
            null
        } catch (e: RedirectResponseException) {
            println("300 error: ${e.message}")
            null
        } catch (e: Exception) {
            println("Error: ${e.message}")
            null
        }
    }

    override suspend fun fetchTaskDto(): TaskDTO? {
        return try {
            val response: HttpResponse = httpClient.get(" https://c937-176-59-81-68.ngrok-free.app/task/project")
            if (response.status.isSuccess()) {
                response.body<TaskDTO>()
            } else {
                println("Server returned error status: ${response.status}")
                null
            }
        } catch (e: ServerResponseException) {
            println("500 error: ${e.message}")
            null
        } catch (e: ClientRequestException) {
            println("400 error: ${e.message}")
            null
        } catch (e: RedirectResponseException) {
            println("300 error: ${e.message}")
            null
        } catch (e: Exception) {
            println("Error: ${e.message}")
            null
        }
    }


}