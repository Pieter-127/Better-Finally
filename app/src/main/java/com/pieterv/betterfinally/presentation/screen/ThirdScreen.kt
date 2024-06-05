package com.pieterv.betterfinally.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.pieterv.betterfinally.presentation.navigation.ThirdScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThirdScreen( thirdScreen: ThirdScreen) {
    Scaffold(topBar = { TopAppBar(title = { Text("One last World") }) }) {
        Column(
            modifier = Modifier.padding(it).fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(thirdScreen.example)
        }
    }
}