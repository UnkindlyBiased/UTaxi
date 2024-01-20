package com.litekreu.utaxi.data.api

import com.litekreu.utaxi.BuildConfig
import com.litekreu.utaxi.data.model.Response
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Query

interface RequestsApi {
    companion object {
        const val BASE_URL = "https://maps.googleapis.com/maps/api/directions/"
    }

    @GET("json")
    suspend fun getRoute(
        @Query("origin") origin: String = "Київ",
        @Query("destination") destination: String = "Чернівці",
        @Query("key") apiKey: String = BuildConfig.MAPS_API_KEY
    ) : Response
}