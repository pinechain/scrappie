package com.pinechain.model.dto

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class RecipeDTO (
    @SerializedName("title")
    val title: String,

    @SerializedName("image")
    val imageUrl: String,

    @SerializedName("readyInMinutes")
    val readyInMinutes: Int,

    @SerializedName("servings")
    val servings: Int,

    @SerializedName("extendedIngredients")
    val extendedIngredients: ArrayList<ExtendedIngredientsDTO>,

    @SerializedName("analyzedInstructions")
    val analyzedInstructions: ArrayList<AnalyzedInstructionsDTO>
)