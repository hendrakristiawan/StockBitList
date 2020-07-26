package com.hendra.ui.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel

abstract class BaseFragment<T : ViewModel>(
    @LayoutRes
    private val layoutId: Int
) : Fragment() {

    lateinit var viewModel: T

    abstract fun onInitDependencyInjection()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutId, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        onInitDependencyInjection()
    }
}