package com.sebbia.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.sebbia.R
import com.sebbia.ui.theme.Red


@Composable
fun Menu() {
    val shape = RoundedCornerShape(20.dp)
    val image = ImageBitmap.imageResource(R.drawable.background)
    val brush = remember(image) { ShaderBrush(ImageShader(image, TileMode.Repeated, TileMode.Repeated)) }
    Scaffold(
        topBar = {
            ToolBar()
        }
    ) {padding ->
        Box(modifier = Modifier.background(brush)){
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White,
                    contentColor = Color.Black
                ), modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp), shape = shape) {
                    Text(text = "Вернуться к проектам")
                }
                Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White,
                    contentColor = Color.Black
                ), modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp), shape = shape) {
                    Text(text = "Участники")
                }
                Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White,
                    contentColor = Color.Black
                ), modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp), shape = shape) {
                    Text(text = "Выйти", color = Red)
                }
            }
        }
    }
}





