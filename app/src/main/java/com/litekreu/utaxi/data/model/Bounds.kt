package com.litekreu.utaxi.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Bounds(
    val northeast: Northeast,
    val southwest: Southwest
)