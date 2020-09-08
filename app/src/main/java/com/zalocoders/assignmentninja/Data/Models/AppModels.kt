package com.zalocoders.assignmentninja.Data.Models

import com.google.gson.annotations.SerializedName

object AppModels{

    data class RegisterUser(
        @SerializedName("name")
        val name:String,
        @SerializedName("email")
        val email:String,
        @SerializedName("password")
        val password:String
    )

    data class LoginUser(
        @SerializedName("email")
        val email:String,
        @SerializedName("password")
        val password:String
    )


    data class CommonResponse(
        @SerializedName("responseCode")
        val responseCode:String,
        @SerializedName("responseDetails")
        val responseDetails:String
    )


}