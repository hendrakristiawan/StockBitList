package com.hendra.stockbitlist.di

import com.hendra.core.di.CoreComponent
import com.hendra.core.di.scopes.FeatureScope
import com.hendra.stockbitlist.LoginFragment
import com.hendra.stockbitlist.WatchListFragment
import dagger.Component

@FeatureScope
@Component(
    modules = [HomeListModule::class],
    dependencies = [CoreComponent::class]
)
interface HomeListComponent {

    fun inject(watchListFragment: WatchListFragment)
}