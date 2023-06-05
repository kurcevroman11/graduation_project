package com.sebbia.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.sebbia.ui.theme.LightBlue

@Composable
fun ToolBar() {
    Box(modifier = Modifier
        .height(60.dp)
        .fillMaxWidth()
        .background(LightBlue)
        .padding(all = 0.dp)){
        TopAppBar(backgroundColor = Color.Transparent,
            modifier = Modifier.padding(start = 6.dp, end = 6.dp),
            elevation = 0.dp,
        ){
            IconButton(onClick = { /*TODO*/ }) { Icon(Icons.Filled.ArrowBack, tint = Color(0xFFFFFFFF), contentDescription = "Назад")}
            Spacer(Modifier.weight(1f, true))
            Text(text = "Сайт Nissan", color = Color(0xFFFFFFFF), fontSize = 20.sp, maxLines = 1, overflow = TextOverflow.Ellipsis,
                modifier = Modifier.width(200.dp))
            Spacer(Modifier.weight(1f, true))
            IconButton(onClick = { /*TODO*/ }) { Icon(Icons.Filled.Search, tint = Color(0xFFFFFFFF), contentDescription = "Поиск")}
            IconButton(onClick = { /*TODO*/ }) { Icon(Icons.Filled.Menu, tint = Color(0xFFFFFFFF),contentDescription = "Меню")}
        }
    }
}
@Composable
fun ToolBarMain() {
    Box(modifier = Modifier
        .height(60.dp)
        .fillMaxWidth()
        .background(LightBlue)
        .padding(all = 0.dp)){
        TopAppBar(backgroundColor = Color.Transparent,
            modifier = Modifier.padding(start = 6.dp, end = 6.dp),
            elevation = 0.dp,
        ){
            Spacer(Modifier.weight(1f, true))
            Text(text = "Все проекты", color = Color(0xFFFFFFFF), fontSize = 20.sp, modifier = Modifier.weight(6f))
            Spacer(Modifier.weight(2f, true))
            IconButton(onClick = { /*TODO*/ }) { Icon(Icons.Filled.Search, tint = Color(0xFFFFFFFF), contentDescription = "Поиск")}
            Spacer(Modifier.weight(0.1f, true))
            IconButton(onClick = { /*TODO*/ }) { Icon(Icons.Filled.Add, tint = Color(0xFFFFFFFF), contentDescription = "Создать")}
            Spacer(Modifier.weight(0.1f, true))
            IconButton(onClick = { /*TODO*/ }) { Icon(Icons.Filled.Menu, tint = Color(0xFFFFFFFF),contentDescription = "Меню")}
        }
    }
}
@Composable
fun ToolBarDescription() {
    Box(modifier = Modifier
        .height(60.dp)
        .fillMaxWidth()
        .background(LightBlue)
        .padding(all = 0.dp)){
        TopAppBar(backgroundColor = Color.Transparent,
            modifier = Modifier.padding(start = 6.dp, end = 6.dp),
            elevation = 0.dp
        ){
            IconButton(onClick = {  }) { Icon(Icons.Filled.ArrowBack, tint = Color(0xFFFFFFFF), contentDescription = "Назад")}
            Spacer(Modifier.weight(1f, true))
            Text(text = "Изучение Kotlin Multiply", color = Color(0xFFFFFFFF), fontSize = 20.sp, maxLines = 1, overflow = TextOverflow.Ellipsis,
                modifier = Modifier.width(200.dp))
            Spacer(Modifier.weight(1f, true))
            IconButton(onClick = { /*TODO*/ }) { Icon(Icons.Filled.Menu, tint = Color(0xFFFFFFFF),contentDescription = "Меню")}
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TBPreview() {

}