package com.litekreu.utaxi.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Route(
    val bounds: Bounds,
    val copyrights: String,
    val legs: List<Leg>,
    val overview_polyline: OverviewPolyline,
    val summary: String,
    val warnings: List<String>,
    val waypoint_order: List<String>
)