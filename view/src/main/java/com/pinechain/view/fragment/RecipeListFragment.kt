package com.pinechain.view.fragment

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.pinechain.api.retrofit.Retrofit
import com.pinechain.core.constants.KEY_BUNDLE_INGREDIENT_LIST
import com.pinechain.core.constants.KEY_FRAGMENT_SEARCH_BY_INGREDIENTS
import com.pinechain.core.utils.ViewUtils
import com.pinechain.core.utils.StringUtils
import com.pinechain.model.dto.RecipeDTO
import com.pinechain.model.dto.RecipeIndexDTO
import com.pinechain.view.R
import com.pinechain.view.adapter.RecipeSummaryAdapter
import com.pinechain.view.databinding.FragmentRecipeListBinding
import com.zhuinden.simplestackextensions.fragments.KeyedFragment
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
class RecipeListFragment(
    private val originFragmentConstKey: String,
    private val originFragmentBundle: Bundle
) : KeyedFragment(R.layout.fragment_recipe_list) {
    private lateinit var mAdapter: RecipeSummaryAdapter
    private lateinit var mBinding: FragmentRecipeListBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mBinding = FragmentRecipeListBinding.bind(view)
        mAdapter = RecipeSummaryAdapter(requireContext())

        setupDataBinding()
        fillViewWithData()
    }

    private fun setupDataBinding() {
        ViewUtils.setupRecyclerView(
            mBinding.recyclerView,
            mAdapter,
            LinearLayoutManager(context)
        )
    }

    private fun fillViewWithData() {
        when (originFragmentConstKey) {
            KEY_FRAGMENT_SEARCH_BY_INGREDIENTS -> startSearchByIngredients()
        }
    }

    // TODO: Enhance this code by using reactive standard. PLEASE!!
    private fun startSearchByIngredients() {
        val call = Retrofit.mSpoonacularService.searchByIngredients(
            originFragmentBundle.getString(
                KEY_BUNDLE_INGREDIENT_LIST,
                ""
            )
        )
        val callback = object : Callback<ArrayList<RecipeIndexDTO>> {
            override fun onFailure(call: Call<ArrayList<RecipeIndexDTO>>, t: Throwable) {
                Log.e(RecipeListFragment::class.java.name, t.toString())
            }

            override fun onResponse(
                call: Call<ArrayList<RecipeIndexDTO>>,
                response: Response<ArrayList<RecipeIndexDTO>>
            ) {
                response.body()?.let {
                    val recipeIds = ArrayList<String>()
                    for(recipe in it) {
                        recipeIds.add(recipe.id.toString())
                    }

                    val recipeCall = Retrofit.mSpoonacularService.getRecipes(StringUtils.parseList(recipeIds, ","))
                    val recipeCallback = object : Callback<ArrayList<RecipeDTO>> {
                        override fun onFailure(call: Call<ArrayList<RecipeDTO>>, t: Throwable) {
                            Log.e(RecipeListFragment::class.java.name, t.toString())
                        }

                        override fun onResponse(
                            call: Call<ArrayList<RecipeDTO>>,
                            response: Response<ArrayList<RecipeDTO>>
                        ) {
                            response.body()?.let { recipeDTOs ->
                                mAdapter.addAll(recipeDTOs)
                            }
                        }
                    }

                    recipeCall.enqueue(recipeCallback)
                }
            }
        }

        call.enqueue(callback)
    }
}