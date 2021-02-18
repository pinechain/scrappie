package com.pinechain.core.utils

import android.content.Context
import android.content.Intent

class ScreenFlowUtils private constructor() {
    companion object {
        fun showActivity(intent: Intent, context: Context, outsideActivity: Boolean) {
            if (outsideActivity) {
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            context.startActivity(intent)
        }
    }
}