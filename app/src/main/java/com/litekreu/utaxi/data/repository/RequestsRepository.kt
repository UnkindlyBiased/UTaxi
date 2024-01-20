package com.litekreu.utaxi.data.repository

import com.litekreu.utaxi.data.model.OverviewPolyline
import kotlinx.coroutines.flow.Flow

interface RequestsRepository {
    suspend fun getRoute(): Flow<OverviewPolyline>
}