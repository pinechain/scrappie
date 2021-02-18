package com.pinechain

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.pinechain.core.utils.ScreenFlowUtils
import com.pinechain.view.activity.SearchByIngredientsActivity

class Scrappie : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ScreenFlowUtils.showActivity(Intent(this, SearchByIngredientsActivity::class.java), this, false)
    }
}