package com.sebbia.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.sebbia.R
import com.sebbia.Routes

@Composable
fun ProjectScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            ToolBarMain()
        }
    ){innerPadding ->
        Image(painter = painterResource(id = R.drawable.background), contentDescription = "Фон", Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues = innerPadding)
        ) {
            Button(onClick = { navController.navigate(Routes.ProjectTasks.route) }) {

            }
            Button(onClick = { navController.navigate(Routes.Comments.route) }) {

            }
        }
    }
}
