package com.pinechain.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.pinechain.core.base.BaseListItemAdapter
import com.pinechain.model.dto.ExtendedIngredientsDTO
import com.pinechain.view.R
import com.pinechain.view.viewholder.IngredientDisplayVH

class IngredientDisplayAdapter : BaseListItemAdapter<ExtendedIngredientsDTO, IngredientDisplayVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)  = IngredientDisplayVH(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.view_text_list_item, parent, false))

    override fun onBindViewHolder(holder: IngredientDisplayVH, position: Int) {
        holder.mBinding.item = mListItems[position].originalString
    }
}