package com.pinechain.core.utils

import android.app.Activity
import androidx.recyclerview.widget.RecyclerView
import com.pinechain.core.base.BaseListItemAdapter

class ViewUtils private constructor() {
    companion object {
        fun <T, Q : RecyclerView.ViewHolder, P : BaseListItemAdapter<T, Q>> setupRecyclerView(recyclerView: RecyclerView, adapter: P, layoutManager: RecyclerView.LayoutManager, itemDecoration: RecyclerView.ItemDecoration? = null) {
            recyclerView.adapter = adapter
            recyclerView.layoutManager = layoutManager
            itemDecoration?.let { recyclerView.addItemDecoration(it) }
        }

        fun resetFocus(activity: Activity) {
            activity.currentFocus?.clearFocus()
        }
    }
}
