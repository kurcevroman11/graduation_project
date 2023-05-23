package com.sebbia.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sebbia.ui.theme.Grey
import java.time.format.TextStyle


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ProjectSubTask(){
    val shape = RoundedCornerShape(12.dp)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {
        Box(modifier = Modifier
            .clip(shape)
            .background(Grey)
            .fillMaxWidth()){
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp), verticalArrangement = Arrangement.spacedBy(15.dp)) {
                Text(text = "Описание", modifier = Modifier
                    .padding(bottom = 5.dp)
                    .fillMaxWidth(),
                    fontSize = 20.sp, textAlign = TextAlign.Center)
                Box(modifier = Modifier
                    .clip(shape)
                    .background(Color.White)
                    .fillMaxWidth()
                    .padding(all = 10.dp)){
                    val text = remember { mutableStateOf("") }
                    val maxChar = 100
                    TextField(
                        value = text.value,
                        onValueChange = {if (it.length <= maxChar) text.value = it},
                        textStyle = androidx.compose.ui.text.TextStyle(fontSize = 12.sp),
                        modifier = Modifier.fillMaxWidth(),
                        colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent),
                        placeholder = { Text(text = "Краткое описание (240 символов)", color = Grey)})
                }
            }
        }
        Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(backgroundColor = Grey),
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape)) {
            Text(text = "Файлы", modifier = Modifier.padding(bottom = 5.dp),
                fontSize = 20.sp)
        }
        Box(modifier = Modifier
            .clip(shape)
            .background(Grey)
            .fillMaxWidth()){
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp), verticalArrangement = Arrangement.spacedBy(15.dp)) {
                Text(text = "Все задачи", modifier = Modifier.padding(bottom = 5.dp),
                    fontSize = 20.sp)
                Box(modifier = Modifier
                    .clip(shape)
                    .background(Color.White)
                    .fillMaxWidth()
                    .padding(all = 10.dp)){
                    Column(modifier = Modifier
                        .fillMaxWidth()) {
                        Row {
                            Text(text = "Задача №1.1")
                            Spacer(modifier = Modifier.weight(1f, true))
                            CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false){
                                IconButton(onClick = { /*TODO*/ }) { Icon(
                                    Icons.Filled.List,
                                    tint = Color.Black, contentDescription = "Описание",
                                    modifier = Modifier.size(20.dp)) }
                            }
                        }
                        Row(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)) {
                            Text(text = "Синтаксис",
                                fontSize = 20.sp, maxLines = 1, overflow = TextOverflow.Ellipsis,
                                modifier = Modifier.width(200.dp))

                        }
                        Row {
                            Text(text = "Backend, Mobile", modifier = Modifier.weight(1f))
                            Spacer(modifier = Modifier.weight(0.1f, true))
                            CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false){
                                IconButton(onClick = { /*TODO*/ }) { Icon(
                                    Icons.Filled.Add,
                                    tint = Color.Black, contentDescription = "Добавить",
                                    modifier = Modifier.size(20.dp)) }
                                Spacer(modifier = Modifier.weight(0.1f, true))
                                IconButton(onClick = { /*TODO*/ }) { Icon(
                                    Icons.Filled.Create,
                                    tint = Color.Black, contentDescription = "Редактировать",
                                    modifier = Modifier.size(20.dp)) }
                                Spacer(modifier = Modifier.weight(0.1f, true))
                                IconButton(onClick = { /*TODO*/ }) { Icon(
                                    Icons.Filled.Delete,
                                    tint = Color.Black, contentDescription = "Удалить",
                                    modifier = Modifier.size(20.dp)) }
                            }
                        }
                    }
                }
                Box(modifier = Modifier
                    .clip(shape)
                    .background(Color.White)
                    .fillMaxWidth()
                    .padding(all = 10.dp)){
                    Column(modifier = Modifier
                        .fillMaxWidth()) {
                        Row {
                            Text(text = "Задача №1.2")
                            Spacer(modifier = Modifier.weight(1f, true))
                            CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false){
                                IconButton(onClick = { /*TODO*/ }) { Icon(
                                    Icons.Filled.List,
                                    tint = Color.Black, contentDescription = "Описание",
                                    modifier = Modifier.size(20.dp)) }
                            }
                        }
                        Row(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)) {
                            Text(text = "Конструкции",
                                fontSize = 20.sp, maxLines = 1, overflow = TextOverflow.Ellipsis,
                                modifier = Modifier.width(200.dp))
                            Spacer(modifier = Modifier.weight(1f, true))
                            Text(text = "140 ч")

                        }
                        Row {
                            Text(text = "Backend, Mobile", modifier = Modifier.weight(1f))
                            Spacer(modifier = Modifier.weight(0.1f, true))
                            CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false){
                                IconButton(onClick = { /*TODO*/ }) { Icon(
                                    Icons.Filled.Add,
                                    tint = Color.Black, contentDescription = "Добавить",
                                    modifier = Modifier.size(20.dp)) }
                                Spacer(modifier = Modifier.weight(0.1f, true))
                                IconButton(onClick = { /*TODO*/ }) { Icon(
                                    Icons.Filled.Create,
                                    tint = Color.Black, contentDescription = "Редактировать",
                                    modifier = Modifier.size(20.dp)) }
                                Spacer(modifier = Modifier.weight(0.1f, true))
                                IconButton(onClick = { /*TODO*/ }) { Icon(
                                    Icons.Filled.Delete,
                                    tint = Color.Black, contentDescription = "Удалить",
                                    modifier = Modifier.size(20.dp)) }
                            }
                        }
                    }
                }

                Box(modifier = Modifier
                    .clip(shape)
                    .background(Color.White)
                    .fillMaxWidth()
                    .padding(all = 10.dp)){
                    Column(modifier = Modifier
                        .fillMaxWidth()) {
                        Row {
                            Text(text = "Задача №1.3")
                        }
                        Row(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)) {
                            Text(text = "Паттерны",
                                fontSize = 20.sp, maxLines = 1, overflow = TextOverflow.Ellipsis,
                                modifier = Modifier.width(200.dp))

                        }
                        Row {
                            Text(text = "Frontend", modifier = Modifier.weight(1f))
                            Spacer(modifier = Modifier.weight(0.1f, true))
                            CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false){
                                IconButton(onClick = { /*TODO*/ }) { Icon(
                                    Icons.Filled.Add,
                                    tint = Color.Black, contentDescription = "Добавить",
                                    modifier = Modifier.size(20.dp)) }
                                Spacer(modifier = Modifier.weight(0.1f, true))
                                IconButton(onClick = { /*TODO*/ }) { Icon(
                                    Icons.Filled.Create,
                                    tint = Color.Black, contentDescription = "Редактировать",
                                    modifier = Modifier.size(20.dp)) }
                                Spacer(modifier = Modifier.weight(0.1f, true))
                                IconButton(onClick = { /*TODO*/ }) { Icon(
                                    Icons.Filled.Delete,
                                    tint = Color.Black, contentDescription = "Удалить",
                                    modifier = Modifier.size(20.dp)) }
                            }
                        }
                    }
                }

                Row {
                    TextButton(onClick = {  }, modifier = Modifier.width(220.dp)) {
                        CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false) {
                            IconButton(onClick = {}) { Icon(
                                Icons.Filled.Add,
                                tint = Color.Black, contentDescription = "Добавить",
                                modifier = Modifier.size(20.dp)) }
                            Spacer(modifier = Modifier.weight(0.1f, true))
                        }
                        Text(text = "Добавить задачу", modifier = Modifier
                            .weight(8f), color = Color.Black, fontSize = 18.sp)
                    }
                }
            }
        }

        Box(modifier = Modifier
            .clip(shape)
            .background(Grey)
            .fillMaxWidth()){
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp), verticalArrangement = Arrangement.spacedBy(15.dp)) {
                Text(text = "Выполнено", modifier = Modifier.padding(bottom = 5.dp),
                    fontSize = 20.sp)
                val createNewFun = remember { mutableStateOf(false) }
                if(createNewFun.value){
                    NewTask()
                }
                Row {
                    TextButton(onClick = { createNewFun.value = true }, modifier = Modifier.width(220.dp)) {
                        CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false) {
                            IconButton(onClick = {}) { Icon(
                                Icons.Filled.Add,
                                tint = Color.Black, contentDescription = "Добавить",
                                modifier = Modifier.size(20.dp)) }
                        }
                        Text(text = "Добавить задачу", modifier = Modifier
                            .weight(8f), color = Color.Black, fontSize = 18.sp)
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun k() {
    ProjectSubTask()
}