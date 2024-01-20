package com.litekreu.utaxi.data.api

import com.litekreu.utaxi.BuildConfig
import de.jensklingenberg.ktorfit.http.GET

interface RequestsApi {
    companion object {
        const val BASE_URL = "https://maps.googleapis.com/maps/api/directions/"
    }

    @GET("json")
    suspend fun getRoute() : String
}