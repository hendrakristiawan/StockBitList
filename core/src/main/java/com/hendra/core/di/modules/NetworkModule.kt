package com.hendra.core.di.modules

import com.hendra.core.network.repositories.WatchListRepository
import com.hendra.core.network.services.WatchListService
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideHttpClient(): OkHttpClient {
        val clientBuilder = OkHttpClient.Builder()
        return clientBuilder.build()
    }

    @Singleton
    @Provides
    fun provideRetrofitBuilder(): Retrofit = Retrofit.Builder()
        .baseUrl("https://min-api.cryptocompare.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Singleton
    @Provides
    fun provideWatchListService(retrofit: Retrofit): WatchListService =
        retrofit.create(WatchListService::class.java)

    @Singleton
    @Provides
    fun provideWatchListRepository(service: WatchListService) = WatchListRepository(service)

}