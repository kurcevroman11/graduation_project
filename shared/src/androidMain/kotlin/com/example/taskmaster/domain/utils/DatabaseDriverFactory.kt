package com.example.taskmaster.domain.utils

import app.cash.sqldelight.db.SqlDriver

actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver {
        TODO("Not yet implemented")
//        return AndroidSqliteDriver(
//            schema = MoviesDb.Schema,
//            context = context,
//            name = "movies.db"
//        )
    }
}