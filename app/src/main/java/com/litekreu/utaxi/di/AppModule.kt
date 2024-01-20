package com.litekreu.utaxi.di

import com.litekreu.utaxi.data.api.RequestsApi
import com.litekreu.utaxi.data.repository.RequestsRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import de.jensklingenberg.ktorfit.Ktorfit
import de.jensklingenberg.ktorfit.converter.builtin.CallConverterFactory
import de.jensklingenberg.ktorfit.converter.builtin.FlowConverterFactory
import de.jensklingenberg.ktorfit.ktorfit
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    fun providesKtorfitInstance(): Ktorfit = ktorfit {
        baseUrl(RequestsApi.BASE_URL)
        httpClient(HttpClient {
            install(ContentNegotiation) {
                json(Json { isLenient = true; ignoreUnknownKeys = true })
            }
        })
        converterFactories(
            FlowConverterFactory(),
            CallConverterFactory(),
        )
    }

    @Provides
    fun providesApi(ktorfitInstance: Ktorfit): RequestsApi = ktorfitInstance.create()

    @Provides
    fun providesRepositoryImplementation(api: RequestsApi):
            RequestsRepositoryImpl = RequestsRepositoryImpl(api)
}