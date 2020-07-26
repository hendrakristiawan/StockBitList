package com.hendra.stockbitlist.di

import com.hendra.core.di.CoreComponent
import com.hendra.core.di.scopes.AppScope
import com.hendra.stockbitlist.App
import dagger.Component

@AppScope
@Component(
    dependencies = [CoreComponent::class],
    modules = [AppModule::class]
)
interface AppComponent {
    fun inject(application: App)
}