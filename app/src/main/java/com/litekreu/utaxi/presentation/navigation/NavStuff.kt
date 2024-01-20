package com.litekreu.utaxi.presentation.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.ui.graphics.vector.ImageVector
import com.litekreu.utaxi.R

data class NavItem(
    @StringRes val name: Int,
    val route: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector
)

object NavRoutes {
    private val Map = NavItem(
        name = R.string.map,
        route = "map",
        selectedIcon = Icons.Default.Home,
        unselectedIcon = Icons.Outlined.Home
    )
    private val List = NavItem(
        name = R.string.routes_list,
        route = "list",
        selectedIcon = Icons.Default.List,
        unselectedIcon = Icons.Outlined.List
    )
    val routesList = listOf(Map, List)
}