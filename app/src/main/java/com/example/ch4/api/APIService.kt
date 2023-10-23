package com.example.ch4.api

import android.telecom.Call
import androidx.room.Query
import com.example.ch4.model.OrderRequest
import com.example.ch4.model.OrderResponse
import com.firebase.ui.auth.BuildConfig
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import java.util.Locale.Category
import java.util.concurrent.TimeUnit
import com.example.ch4.model.CategoryMenu as CategoryMenu1


interface APIService {

    @GET("order")
    suspend fun createOrder(@Body orderRequest: OrderRequest): OrderResponse

    companion object {
        @JvmStatic
        operator fun invoke(): APIService {
            val okHttpClient = OkHttpClient.Builder()
                .connectTimeout(120, TimeUnit.SECONDS)
                .readTimeout(120, TimeUnit.SECONDS)
                .build()
            val retrofit = Retrofit.Builder()
                .baseUrl(BuildConfig.BUILD_TYPE)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()
            return retrofit.create(APIService::class.java)
        }
    }
}