package com.hendra.stockbitlist

import android.app.Application
import android.content.Context
import com.hendra.core.di.CoreComponent

class App : Application() {
    lateinit var coreComponent: CoreComponent
    companion object {
        fun coreComponent(context: Context) {
            (context.applicationContext as App).coreComponent
        }
    }
    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent
            .builder()
            .coreComponent(coreComponent)
            .build()
            .inject(this)
    }
}