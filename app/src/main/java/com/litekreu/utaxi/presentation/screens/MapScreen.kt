package com.litekreu.utaxi.presentation.screens

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.Polyline
import com.litekreu.utaxi.domain.MapViewModel

@Composable
fun MapScreen(viewModel: MapViewModel) {
    val cameraPosState by viewModel.cameraPosState.collectAsStateWithLifecycle()

    GoogleMap(
        cameraPositionState = cameraPosState,
        modifier = Modifier.fillMaxHeight()
    ) { }
}