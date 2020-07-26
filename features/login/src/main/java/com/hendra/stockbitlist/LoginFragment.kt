package com.hendra.stockbitlist

import com.hendra.login.R
import com.hendra.ui.base.BaseFragment

class LoginFragment : BaseFragment<LoginViewModel>(layoutId = R.layout.login_fragment) {

    override fun onInitDependencyInjection() {
        DaggerCharactersListComponent
            .builder()
            .coreComponent(App.coreComponent(requireContext()))
            .charactersListModule((this))
            .build()
            .inject(this)
    }

}