package com.pinechain.core.utils

import android.app.Activity
import android.content.Context
import android.graphics.drawable.Drawable
import android.net.Uri
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.target.CustomTarget

class GlideUtils private constructor() {
    companion object {
        fun loadFromUrl(context: Context, url: String, customTarget: CustomTarget<Drawable>? = null, imageView: ImageView? = null) {
            loadFromUrl(Glide.with(context), url, customTarget, imageView)
        }

        fun loadFromUrl(activity: Activity, url: String, customTarget: CustomTarget<Drawable>? = null, imageView: ImageView? = null) {
            loadFromUrl(Glide.with(activity), url, customTarget, imageView)
        }

        fun loadFromUrl(fragment: Fragment, url: String, customTarget: CustomTarget<Drawable>? = null, imageView: ImageView? = null) {
            loadFromUrl(Glide.with(fragment), url, customTarget, imageView)
        }

        private fun loadFromUrl(requestManager: RequestManager, url: String, customTarget: CustomTarget<Drawable>? = null, imageView: ImageView? = null) {
            if (customTarget != null) {
                requestManager
                    .asDrawable()
                    .load(Uri.parse(url))
                    .into(customTarget)
            }

            if (imageView != null) {
                requestManager
                    .load(Uri.parse(url))
                    .into(imageView)
            }
        }
    }
}