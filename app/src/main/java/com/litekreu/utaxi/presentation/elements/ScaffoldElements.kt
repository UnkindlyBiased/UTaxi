package com.litekreu.utaxi.presentation.elements

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.litekreu.utaxi.presentation.navigation.NavRoutes

@Composable
fun MapNavBar(
    navController: NavController
) {
    val currentBackStackEntry by navController.currentBackStackEntryAsState()
    val previousBackStackEntry = navController.previousBackStackEntry

    val currentRoute = currentBackStackEntry?.destination?.route
    val previousRoute = previousBackStackEntry?.destination?.route

    BottomAppBar {
        NavRoutes.routesList.forEach { navItem ->
            NavigationBarItem(
                selected = navItem.route == currentRoute,
                onClick = {
                    if (previousRoute == navItem.route) {
                        navController.popBackStack()
                    }
                    else navController.navigate(navItem.route)
                },
                icon = {
                    Icon(imageVector = if (navItem.route == currentRoute) {
                        navItem.selectedIcon
                    }
                    else navItem.unselectedIcon, contentDescription = null)
                },
                label = { Text(text = stringResource(navItem.name)) }
            )
        }
    }
}



