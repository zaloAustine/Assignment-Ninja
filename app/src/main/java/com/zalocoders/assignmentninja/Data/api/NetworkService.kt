package com.zalocoders.assignmentninja.Data.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkService {

    private const val BASE_URL = "http://assist.study.zalocoders.co.ke/api/"


    private var loggingInterceptor: HttpLoggingInterceptor = HttpLoggingInterceptor()


    private val client: OkHttpClient = OkHttpClient.Builder()
    .connectTimeout(100, java.util.concurrent.TimeUnit.SECONDS).readTimeout(100, java.util.concurrent.TimeUnit.SECONDS).writeTimeout(100, java.util.concurrent.TimeUnit.SECONDS).addInterceptor(loggingInterceptor)
    .build()


    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build() //Doesn't require the adapter
    }

    val apiService: ApiService = getRetrofit().create(ApiService::class.java)

}


