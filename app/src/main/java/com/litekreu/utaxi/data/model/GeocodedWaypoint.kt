package com.litekreu.utaxi.data.model

import kotlinx.serialization.Serializable

@Serializable
data class GeocodedWaypoint(
    val geocoder_status: String,
    val place_id: String,
    val types: List<String>
)