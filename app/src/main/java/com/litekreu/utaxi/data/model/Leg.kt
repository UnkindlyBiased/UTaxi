package com.litekreu.utaxi.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Leg(
    val distance: Distance,
    val duration: Duration,
    val end_address: String,
    val end_location: EndLocation,
    val start_address: String,
    val start_location: StartLocation,
    val steps: List<Step>,
    val traffic_speed_entry: List<String>,
    val via_waypoint: List<String>
)