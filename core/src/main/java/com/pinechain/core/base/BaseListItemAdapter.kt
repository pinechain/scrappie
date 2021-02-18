package com.pinechain.core.base

import androidx.recyclerview.widget.RecyclerView
import com.pinechain.core.utils.StringUtils

abstract class BaseListItemAdapter<T, Q : RecyclerView.ViewHolder> (protected val mListItems: ArrayList<T> = ArrayList()) :
    RecyclerView.Adapter<Q>() {

    override fun getItemCount() = mListItems.size

    fun add(item: T) {
        if (!mListItems.contains(item)) {
            mListItems.add(item)
            notifyDataSetChanged()
        }
    }

    fun addAll(list: ArrayList<T>) {
        mListItems.clear()
        mListItems.addAll(list)
        notifyDataSetChanged()
    }

    override fun toString(): String {
        return StringUtils.parseList(mListItems, ",")
    }
}