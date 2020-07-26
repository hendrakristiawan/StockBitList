package com.hendra.stockbitlist.di

import android.content.Context
import com.hendra.stockbitlist.App
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun providesContext(application: App): Context = application.applicationContext
}