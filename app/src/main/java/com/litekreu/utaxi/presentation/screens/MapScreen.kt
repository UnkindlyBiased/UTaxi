package com.litekreu.utaxi.presentation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.google.maps.android.compose.GoogleMap
import com.litekreu.utaxi.domain.MapViewModel

@Composable
fun MapScreen(viewModel: MapViewModel) {
    val cameraPosState by viewModel.cameraPosState.collectAsStateWithLifecycle()

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp)
    ) {
        Card {
           GoogleMap(
               cameraPositionState = cameraPosState,
               modifier = Modifier.fillMaxHeight(0.9f)
           ) {

           }
        }
    }
}