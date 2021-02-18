package com.pinechain.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pinechain.core.base.BaseListItemAdapter
import com.pinechain.view.R
import com.pinechain.view.viewholder.IngredientInputVH

class IngredientInputAdapter : BaseListItemAdapter<String, IngredientInputVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = IngredientInputVH(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.view_dynamic_list_item, parent, false)
    )

    override fun onBindViewHolder(holder: IngredientInputVH, position: Int) {
        holder.mBinding.ingredientName = mListItems[position]
        holder.mBinding.removeButtonListener = View.OnClickListener {
            mListItems.removeAt(position)
            notifyDataSetChanged()
        }
    }
}