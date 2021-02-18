package com.pinechain.core.utils

import com.pinechain.core.base.BaseInterceptor
import com.pinechain.core.interceptor.LogInterceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

class OkHttpUtils private constructor(){
    companion object {
        fun addInterceptors(clientBuilder: OkHttpClient.Builder, vararg interceptors: BaseInterceptor) : OkHttpClient.Builder {
            for (interceptor in interceptors) {
                clientBuilder.addInterceptor(interceptor.get())
            }

            return clientBuilder
        }

        fun HeaderLogInterceptor() : LogInterceptor = LogInterceptor(HttpLoggingInterceptor.Level.HEADERS)
        fun BodyLogInterceptor() : LogInterceptor = LogInterceptor(HttpLoggingInterceptor.Level.BODY)
        fun BasicLogInterceptor() : LogInterceptor = LogInterceptor(HttpLoggingInterceptor.Level.BASIC)
        fun NoLogInterceptor() : LogInterceptor = LogInterceptor(HttpLoggingInterceptor.Level.NONE)
    }
}