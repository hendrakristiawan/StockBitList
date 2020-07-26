package com.hendra.stockbitlist.di

import com.hendra.core.di.scopes.FeatureScope
import com.hendra.stockbitlist.LoginFragment
import com.hendra.stockbitlist.LoginViewModel
import dagger.Module
import dagger.Provides

@Module
class LoginModule(
    val fragment: LoginFragment
) {

    @FeatureScope
    @Provides
    fun providesCharacterDetailViewModel() = fragment.viewModel {
        LoginViewModel()
    }
}