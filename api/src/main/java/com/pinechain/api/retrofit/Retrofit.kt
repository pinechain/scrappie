package com.pinechain.api.retrofit

import com.pinechain.core.constants.BASE_URL
import com.pinechain.api.BuildConfig
import com.pinechain.core.interceptor.ApiKeyInterceptor
import com.pinechain.api.service.SpoonacularAPIService
import com.pinechain.core.utils.OkHttpUtils
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofit {
    private val retrofit = Retrofit.Builder()
        .client(createClient())
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val mSpoonacularService = retrofit.create(SpoonacularAPIService::class.java)

    private fun createClient(): OkHttpClient = OkHttpUtils.addInterceptors(OkHttpClient.Builder(), OkHttpUtils.BodyLogInterceptor(), ApiKeyInterceptor(BuildConfig.API_KEY)).build()
}