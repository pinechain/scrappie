package com.pinechain.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.pinechain.core.base.BaseListItemAdapter
import com.pinechain.model.dto.InstructionStepDTO
import com.pinechain.view.R
import com.pinechain.view.viewholder.InstructionStepVH

class InstructionStepAdapter : BaseListItemAdapter<InstructionStepDTO, InstructionStepVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)  = InstructionStepVH(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.view_numbered_list_item, parent, false))

    override fun onBindViewHolder(holder: InstructionStepVH, position: Int) {
        holder.mBinding.index = mListItems[position].number.toString()
        holder.mBinding.item = mListItems[position].step
    }
}