package com.litekreu.utaxi.presentation.elements

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.litekreu.utaxi.presentation.navigation.NavRoutes

@Composable
fun MapNavBar(
    navController: NavController
) {
    val currentBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = currentBackStackEntry?.destination?.route

    BottomAppBar {
        NavRoutes.routesList.forEach { navItem ->
            NavigationBarItem(
                selected = navItem.route == currentRoute,
                onClick = { navController.navigate(navItem.route) },
                icon = {
                    Icon(imageVector = if (navItem.route == currentRoute) {
                        navItem.selectedIcon
                    }
                    else navItem.unselectedIcon, contentDescription = null)
                },
                label = { Text(text = navItem.route) }
            )
        }
    }
}



