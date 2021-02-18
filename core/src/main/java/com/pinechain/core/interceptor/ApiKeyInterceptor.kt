package com.pinechain.core.interceptor

import com.pinechain.core.base.BaseInterceptor
import okhttp3.Interceptor

class ApiKeyInterceptor(private val mApiKey: String) : BaseInterceptor() {
    override val mInterceptor: Interceptor
        get() {
            return Interceptor {
                val originalRequest = it.request()

                val newUrl = originalRequest.url.newBuilder()
                    .addQueryParameter("apiKey", mApiKey)
                    .build()

                it.proceed(originalRequest.newBuilder().url(newUrl).build())
            }
        }
}