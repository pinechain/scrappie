package com.pinechain.model.dto

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class ExtendedIngredientsDTO (
    @SerializedName("name")
    val name: String,

    @SerializedName("amount")
    val amount: Float,

    @SerializedName("unit")
    val unit: String,

    @SerializedName("originalString")
    val originalString: String
)