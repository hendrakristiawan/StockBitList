package com.hendra.core.di.modules

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideHttpClient() {

    }

    @Singleton
    @Provides
    fun provideRetrofitBuilder() {

    }
}