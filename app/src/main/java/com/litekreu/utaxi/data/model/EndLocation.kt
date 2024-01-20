package com.litekreu.utaxi.data.model

import com.google.android.gms.maps.model.LatLng
import kotlinx.serialization.Serializable

@Serializable
data class EndLocation(
    val lat: Double,
    val lng: Double
) {
    fun toLatLng(): LatLng = LatLng(lat, lng)
}