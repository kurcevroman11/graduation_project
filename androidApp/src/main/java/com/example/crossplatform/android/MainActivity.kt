package com.example.crossplatform.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.*
//import com.example.crossplatform.Login

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   var users by remember { mutableStateOf("Loading") }

                    LaunchedEffect(true) {
//                        users = try {
//                           // Login().login("Sebbia1","123321")
//                            Login().getUser().toString()
//                        } catch (e: Exception) {
//                            e.localizedMessage ?: "error"
//                            /*emptyList()*/
//                        }
                    }

                    GreetingView(users)
                }
            }
        }
    }

    @Composable
    fun GreetingView(text:String) {
        Text(text = text)
    }

    @Preview
    @Composable
    fun DefaultPreview() {
        MyApplicationTheme {
            GreetingView("Hello, Android!")
        }
    }
}
