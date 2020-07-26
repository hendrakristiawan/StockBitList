package com.hendra.stockbitlist

import android.app.Application
import com.hendra.stockbitlist.

class App : Application() {
    lateinit var coreComponent : CoreC
    companion object{

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