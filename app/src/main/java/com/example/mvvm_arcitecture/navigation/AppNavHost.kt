package com.example.mvvm_arcitecture.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvm_arcitecture.ui.theme.Screens.home.Homescreen
import com.example.mvvm_arcitecture.ui.theme.Screens.login.Loginscreen
import com.example.mvvm_arcitecture.ui.theme.Screens.register.Registerscreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier, navController: NavHostController = rememberNavController(), startDestination: String= ROUT_LOGIN){
    NavHost(navController = navController,modifier=modifier, startDestination = startDestination){
        composable(ROUT_HOME){
            Homescreen(navController )
        }
        composable(ROUT_LOGIN){
            Loginscreen(navController )
        }
        composable(ROUT_REGISTER){
            Registerscreen(navController )
        }



    }
}




