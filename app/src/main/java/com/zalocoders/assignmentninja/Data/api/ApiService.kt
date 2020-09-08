package com.zalocoders.assignmentninja.Data.api

import com.zalocoders.assignmentninja.Data.Models.AppModels
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST("userRegistration")
    suspend fun registerUser(@Body detail:AppModels.RegisterUser): AppModels.CommonResponse

    @POST("login")
    suspend fun loginUser(@Body detail: AppModels.LoginUser): AppModels.CommonResponse

}