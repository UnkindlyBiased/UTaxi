package com.litekreu.utaxi.presentation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.Polyline
import com.litekreu.utaxi.domain.MapViewModel
import com.litekreu.utaxi.ui.theme.polylineBlue

@Composable
fun MapScreen(viewModel: MapViewModel) {
    val cameraPosState by viewModel.cameraPosState.collectAsStateWithLifecycle()
    val currentPolyline by viewModel.currentPolyline.collectAsStateWithLifecycle()

    Box(modifier = Modifier.fillMaxSize()) {
        GoogleMap(
            cameraPositionState = cameraPosState,
            modifier = Modifier.fillMaxHeight()
        ) {
            Polyline(
                points = currentPolyline,
                color = polylineBlue
            )
            if (currentPolyline.isNotEmpty()) {
                Marker(state = MarkerState(position = currentPolyline.first()))
                Marker(state = MarkerState(position = currentPolyline.last()))
            }
        }
    }
}