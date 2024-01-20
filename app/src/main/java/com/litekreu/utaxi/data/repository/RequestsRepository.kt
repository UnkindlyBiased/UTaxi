package com.litekreu.utaxi.data.repository

import kotlinx.coroutines.flow.Flow

interface RequestsRepository {
    suspend fun getRoute()
}