package com.pinechain.api.service

import com.pinechain.core.constants.*
import com.pinechain.model.dto.RecipeDTO
import com.pinechain.model.dto.RecipeIndexDTO
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface SpoonacularAPIService {
    @GET(ENDPOINT_SEARCH_BY_INGREDIENTS)
    fun searchByIngredients(
        @Query("ingredients")
        ingredients: String,
        @Query("number")
        number: Number = API_PARAM_DEFAULT_NUMBER_OF_RECIPES,
        @Query("limitLicense")
        limitLicense: Boolean = API_PARAM_DEFAULT_LIMIT_LICENSE,
        @Query("ranking")
        ranking: Number = API_PARAM_DEFAULT_RANKING,
        @Query("ignorePantry")
        ignorePantry: Boolean = API_PARAM_DEFAULT_IGNORE_PANTRY) : Call<ArrayList<RecipeIndexDTO>>

    @GET(ENDPOINT_GET_RECIPE)
    fun getRecipe(
        @Path("id")
        id: Int,
        @Query("includeNutrition")
        includeNutrition: Boolean = API_PARAM_DEFAULT_INCLUDE_NUTRITION) : Call<RecipeDTO>

    @GET(ENDPOINT_GET_RECIPES)
    fun getRecipes(
        @Query("ids")
        ids: String,
        @Query("includeNutrition")
        includeNutrition: Boolean = API_PARAM_DEFAULT_INCLUDE_NUTRITION) : Call<ArrayList<RecipeDTO>>

}