package com.pinechain.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pinechain.view.R
import com.pinechain.view.databinding.ActivitySearchByIngredientsBinding
import com.zhuinden.simplestack.History
import com.zhuinden.simplestack.SimpleStateChanger
import com.zhuinden.simplestack.StateChange
import com.zhuinden.simplestack.navigator.Navigator
import com.zhuinden.simplestackextensions.fragments.DefaultFragmentStateChanger
import keys.SearchByIngredientsKey

class SearchByIngredientsActivity : AppCompatActivity(), SimpleStateChanger.NavigationHandler {
    private lateinit var mBinding: ActivitySearchByIngredientsBinding
    private lateinit var mFragmentStateChanger: DefaultFragmentStateChanger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivitySearchByIngredientsBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mFragmentStateChanger = DefaultFragmentStateChanger(supportFragmentManager, R.id.fragment_container)
        Navigator.configure().setStateChanger(SimpleStateChanger(this)).install(this, mBinding.fragmentContainer, History.of(SearchByIngredientsKey()))
    }

    override fun onBackPressed() {
        if (!Navigator.onBackPressed(this)) {
            super.onBackPressed()
        }
    }

    override fun onNavigationEvent(stateChange: StateChange) {
        mFragmentStateChanger.handleStateChange(stateChange)
    }
}