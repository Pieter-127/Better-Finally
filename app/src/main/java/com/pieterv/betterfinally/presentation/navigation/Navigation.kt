package com.pieterv.betterfinally.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.pieterv.betterfinally.presentation.screen.MainScreen
import com.pieterv.betterfinally.presentation.screen.SecondScreen
import com.pieterv.betterfinally.presentation.screen.ThirdScreen
import kotlinx.serialization.Serializable
import androidx.navigation.compose.composable
import androidx.navigation.toRoute

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = FirstScreen) {
        composable<FirstScreen> {
            MainScreen(navController)
        }

        composable<SecondScreen> {
            val args = it.toRoute<SecondScreen>()
            SecondScreen(navController, args)
        }

        composable<ThirdScreen> {
            val args = it.toRoute<ThirdScreen>()
            ThirdScreen(args)

        }
    }
}

@Serializable
object FirstScreen

@Serializable
data class SecondScreen(
    val example: String,
)

@Serializable
data class ThirdScreen(
    val example: String,
)