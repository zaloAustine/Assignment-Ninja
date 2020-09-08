package com.zalocoders.assignmentninja.Utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.zalocoders.assignmentninja.Data.api.ApiService
import com.zalocoders.assignmentninja.Data.repository.AuthRepository
import com.zalocoders.assignmentninja.ViewModel.AuthViewModel

class ViewModelFactory(private val apiHelper: ApiService) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AuthViewModel::class.java)) {
            return AuthViewModel(AuthRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}