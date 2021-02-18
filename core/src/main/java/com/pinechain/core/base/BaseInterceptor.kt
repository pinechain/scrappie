package com.pinechain.core.base

import okhttp3.Interceptor

abstract class BaseInterceptor {
    protected abstract val mInterceptor: Interceptor

    fun get(): Interceptor {
        return mInterceptor
    }
}