package com.zalocoders.assignmentninja.Data.repository

import com.zalocoders.assignmentninja.Data.Models.AppModels
import com.zalocoders.assignmentninja.Data.api.ApiService
import com.zalocoders.assignmentninja.Data.api.NetworkService

class AuthRepository(private val apiHelper: ApiService) {


    suspend fun registerUser(details:AppModels.RegisterUser)  = apiHelper.registerUser(details)

    suspend fun loginUser(details: AppModels.LoginUser) = apiHelper.loginUser(details)

}