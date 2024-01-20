package com.litekreu.utaxi.data.repository

import com.litekreu.utaxi.data.api.RequestsApi
import com.litekreu.utaxi.data.model.OverviewPolyline
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RequestsRepositoryImpl @Inject constructor(
    private val api: RequestsApi
) : RequestsRepository {
    override suspend fun getRoute(): Flow<OverviewPolyline> = flow {
        val finalValue = api.getRoute()
        emit(finalValue.routes[0].overview_polyline)
    }
}