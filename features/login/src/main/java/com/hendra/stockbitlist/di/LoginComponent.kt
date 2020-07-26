package com.hendra.stockbitlist.di

import com.hendra.core.di.CoreComponent
import com.hendra.core.di.scopes.FeatureScope
import com.hendra.stockbitlist.LoginFragment
import dagger.Component

@FeatureScope
@Component(
    modules = [LoginModule::class],
    dependencies = [CoreComponent::class]
)
interface LoginComponent {

    fun inject(loginFragment: LoginFragment)
}