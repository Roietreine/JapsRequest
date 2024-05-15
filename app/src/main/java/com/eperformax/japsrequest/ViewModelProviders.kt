package com.eperformax.japsrequest

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelProviders(
    val japsRepo: JapsRepo,
    val app : Application

) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(JapsViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return JapsViewModel(japsRepo,app) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}