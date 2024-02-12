package com.example.taskmaster.android.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.example.taskmaster.android.MyApplicationTheme
import com.example.taskmaster.android.ui.screens.login_screen.LoginScreen
import org.koin.androidx.compose.getViewModel
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen


@ExperimentalMaterialApi
@ExperimentalFoundationApi
@ExperimentalAnimationApi
@Composable
private fun MainScreen(viewModel: MainActivityViewModel = getViewModel()) {
    viewModel.accessToken
}

@ExperimentalMaterialApi
@ExperimentalFoundationApi
@ExperimentalAnimationApi
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen()

        setContent {
            MyApplicationTheme {
                MainScreen()
            }
        }
    }
}