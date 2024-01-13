package com.litekreu.utaxi.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.litekreu.utaxi.domain.MapViewModel
import com.litekreu.utaxi.presentation.elements.MapNavBar
import com.litekreu.utaxi.presentation.screens.MapScreen

@Composable
fun MainScreen(
    navController: NavHostController = rememberNavController(),
    viewModel: MapViewModel
) {
    Scaffold(
        bottomBar = {
            MapNavBar(navController)
        }
    ) { padding ->
        NavHost(navController = navController, startDestination = "map") {
            composable(route = "map") {
                Box(modifier = Modifier.padding(padding)) {
                    MapScreen(viewModel)
                }
            }
            composable(route = "list") {

            }
        }
    }
}