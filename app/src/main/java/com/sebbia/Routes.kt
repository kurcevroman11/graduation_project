package com.sebbia

sealed class Routes (val route: String){
    object ProjectTasks : Routes("taskScreen")
    object ProjectSubTask : Routes("subTaskScreen")
    object AuthorizationScreen : Routes("register_screen")
    object ProjectScreen : Routes("ProjectScreen")
    object Comments : Routes("comment_screen")
}