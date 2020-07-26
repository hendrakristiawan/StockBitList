package com.hendra.core.di

import android.content.Context
import com.hendra.core.di.modules.ContextModule
import com.hendra.core.di.modules.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ContextModule::class,
        NetworkModule::class
    ]
)
interface CoreComponent {

    fun context(): Context
}