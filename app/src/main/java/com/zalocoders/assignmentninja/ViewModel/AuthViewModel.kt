package com.zalocoders.assignmentninja.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.zalocoders.assignmentninja.Data.Models.AppModels
import com.zalocoders.assignmentninja.Data.repository.AuthRepository
import com.zalocoders.assignmentninja.Utils.Resource
import kotlinx.coroutines.Dispatchers

class AuthViewModel(val authRepository: AuthRepository) : ViewModel(){


    fun registerUsers(details: AppModels.RegisterUser) = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = authRepository.registerUser(details)))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }



    fun loginUser(details:AppModels.LoginUser) = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = authRepository.loginUser(details)))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }

}