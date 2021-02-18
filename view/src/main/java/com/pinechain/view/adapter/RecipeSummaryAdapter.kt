package com.pinechain.view.adapter

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import com.pinechain.core.base.BaseListItemAdapter
import com.pinechain.core.utils.GlideUtils
import com.pinechain.core.utils.ViewUtils
import com.pinechain.model.dto.RecipeDTO
import com.pinechain.view.R
import com.pinechain.view.databinding.DialogRecipeBinding
import com.pinechain.view.viewholder.RecipeSummaryVH

class RecipeSummaryAdapter(private val mContext: Context) :
    BaseListItemAdapter<RecipeDTO, RecipeSummaryVH>() {
    private lateinit var mHolder: RecipeSummaryVH

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = RecipeSummaryVH(
        LayoutInflater.from(parent.context).inflate(
            R.layout.view_recipe_summary, parent, false
        )
    )

    override fun onBindViewHolder(holder: RecipeSummaryVH, position: Int) {
        val recipe = mListItems[position]

        var drawable: Drawable? = null
        val customTarget = object : CustomTarget<Drawable>() {
            override fun onLoadCleared(placeholder: Drawable?) { /* Do nothing */
            }

            override fun onResourceReady(resource: Drawable, transition: Transition<in Drawable>?) {
                drawable = resource
            }
        }
        GlideUtils.loadFromUrl(mContext, recipe.imageUrl, customTarget, holder.mBinding.recipeImage)

        holder.mBinding.recipe = recipe
        holder.mBinding.recipeSummary.setOnClickListener {
            val recipeBinding = DialogRecipeBinding.inflate(LayoutInflater.from(mContext))
            recipeBinding.recipe = recipe
            recipeBinding.recipeImage.setImageDrawable(drawable)
            setupRVs(recipeBinding, recipe)
            setupDialog(recipeBinding)
        }
    }

    private fun setupRVs(recipeBinding: DialogRecipeBinding, recipe: RecipeDTO) {
        val ingredientDisplayAdapter = IngredientDisplayAdapter()
        val instructionStepAdapter = InstructionStepAdapter()
        ingredientDisplayAdapter.addAll(recipe.extendedIngredients)
        instructionStepAdapter.addAll(recipe.analyzedInstructions[0].steps)
        ViewUtils.setupRecyclerView(
            recipeBinding.rvIngredients,
            ingredientDisplayAdapter,
            LinearLayoutManager(mContext, RecyclerView.VERTICAL, false)
        )
        ViewUtils.setupRecyclerView(
            recipeBinding.rvInstructions,
            instructionStepAdapter,
            LinearLayoutManager(mContext, RecyclerView.VERTICAL, false)
        )
    }

    private fun setupDialog(recipeBinding: DialogRecipeBinding) {
        val dialog = Dialog(mContext)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setContentView(recipeBinding.root)
        dialog.setCancelable(true)
        dialog.show()
    }
}