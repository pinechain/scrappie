package com.pinechain.core.interceptor

import com.pinechain.core.base.BaseInterceptor
import okhttp3.logging.HttpLoggingInterceptor


class LogInterceptor(private val mLogLevel: HttpLoggingInterceptor.Level) : BaseInterceptor() {
    override val mInterceptor
        get() = HttpLoggingInterceptor()

    init {
        mInterceptor.level = mLogLevel
    }

}