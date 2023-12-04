package com.example.taskmaster.data.network

object NetworkConstants {
    const val baseUrl = "https://pokeapi.co/api/v2/"

    object Login {
        const val route = baseUrl + "login"
        val byName: (String) -> String = { name -> "$route/$name"}
    }
}