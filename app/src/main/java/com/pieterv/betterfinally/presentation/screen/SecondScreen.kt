package com.pieterv.betterfinally.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.pieterv.betterfinally.presentation.navigation.SecondScreen
import com.pieterv.betterfinally.presentation.navigation.ThirdScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondScreen(navController: NavController, args: SecondScreen) {
    Scaffold(topBar = { TopAppBar(title = { Text("Hello second world") }) }) {
        Column(
            modifier = Modifier.padding(it).fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(onClick = {
                navController.navigate(
                    ThirdScreen(
                        example = "Hello third screen"
                    )
                )
            }) {
                Text(text = "Go to third screen")
            }
        }
    }
}