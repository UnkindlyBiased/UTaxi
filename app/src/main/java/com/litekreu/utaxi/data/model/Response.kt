package com.litekreu.utaxi.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Response(
    val geocoded_waypoints: List<GeocodedWaypoint>,
    val routes: List<Route>,
    val status: String
)