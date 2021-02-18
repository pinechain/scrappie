package com.pinechain.view.fragment

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.pinechain.core.constants.KEY_BUNDLE_INGREDIENT_LIST
import com.pinechain.core.constants.KEY_FRAGMENT_SEARCH_BY_INGREDIENTS
import com.pinechain.core.utils.ViewUtils
import com.pinechain.view.R
import com.pinechain.view.adapter.IngredientInputAdapter
import com.pinechain.view.databinding.FragmentSearchByIngredientsBinding
import com.zhuinden.simplestackextensions.fragments.KeyedFragment
import com.zhuinden.simplestackextensions.fragmentsktx.backstack
import keys.RecipeListKey

class SearchByIngredientsFragment : KeyedFragment(R.layout.fragment_search_by_ingredients) {
    private val mAdapter = IngredientInputAdapter()
    private lateinit var mBinding: FragmentSearchByIngredientsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mBinding = FragmentSearchByIngredientsBinding.bind(view)
        setupDataBinding()
    }

    private fun setupDataBinding() {
        ViewUtils.setupRecyclerView(
            mBinding.dynamicList.recyclerView,
            mAdapter,
            LinearLayoutManager(context)
        )

        mBinding.dynamicList.ingredientInput.setOnEditorActionListener { _, _, _ ->
            addIngredient()
            true
        }

        mBinding.addButtonListener = View.OnClickListener {
            addIngredient()
        }

        mBinding.searchButtonListener = View.OnClickListener {
            if (mAdapter.itemCount > 0) {
                val bundle = Bundle()
                bundle.putString(KEY_BUNDLE_INGREDIENT_LIST, mAdapter.toString())
                backstack.goTo(RecipeListKey(KEY_FRAGMENT_SEARCH_BY_INGREDIENTS, bundle))
            } else {
                Toast.makeText(context, "You should add at least one ingredient before asking that!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun addIngredient() {
        if (!mBinding.dynamicList.ingredientInput.text.toString().trim().isEmpty()) {
            mAdapter.add(mBinding.dynamicList.ingredientInput.text.toString())
            mBinding.dynamicList.ingredientInput.text.clear()
        }
    }
}