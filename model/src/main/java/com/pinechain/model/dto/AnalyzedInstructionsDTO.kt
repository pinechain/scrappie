package com.pinechain.model.dto

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class AnalyzedInstructionsDTO (
    @SerializedName("steps")
    val steps: ArrayList<InstructionStepDTO>
)