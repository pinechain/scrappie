package com.pinechain.model.dto

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class InstructionStepDTO (
    @SerializedName("number")
    val number: Int,

    @SerializedName("step")
    val step: String
)