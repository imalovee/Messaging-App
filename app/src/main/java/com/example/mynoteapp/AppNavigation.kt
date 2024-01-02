package com.example.mynoteapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mynoteapp.screens.LoginScreen
import com.example.mynoteapp.screens.NotesAppPortrait
import com.example.mynoteapp.screens.SignupScreen


object Routes{
    val NotesAppPortraitRoute = "home-screen"
    val LoginScreenRoute = "login-screen"
    val SignUpRoute = "Signup-screen"

}
@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination =Routes.LoginScreenRoute
    ){
        composable(Routes.LoginScreenRoute){
            LoginScreen(navController)
        }
        composable(Routes.NotesAppPortraitRoute){
           NotesAppPortrait(navController)
        }

        composable(Routes.SignUpRoute){
            SignupScreen(navController)
        }
    }
}

