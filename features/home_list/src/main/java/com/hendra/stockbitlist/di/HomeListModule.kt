package com.hendra.stockbitlist.di

import com.hendra.core.di.scopes.FeatureScope
import com.hendra.stockbitlist.LoginFragment
import com.hendra.stockbitlist.LoginViewModel
import com.hendra.stockbitlist.WatchListFragment
import com.hendra.stockbitlist.WatchListViewModel
import dagger.Module
import dagger.Provides

@Module
class HomeListModule(
    val fragment: WatchListFragment
) {

    @FeatureScope
    @Provides
    fun providesCharacterDetailViewModel() = fragment.viewModel {
        WatchListViewModel()
    }
}