package com.litekreu.utaxi.domain

import androidx.lifecycle.ViewModel
import com.google.maps.android.compose.CameraPositionState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MapViewModel : ViewModel() {
    private val _cameraPosState = MutableStateFlow(CameraPositionState())
    val cameraPosState = _cameraPosState.asStateFlow()
}