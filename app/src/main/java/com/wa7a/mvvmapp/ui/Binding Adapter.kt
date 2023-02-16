package com.wa7a.mvvmapp.ui

import android.util.Log
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.databinding.BindingAdapter
import coil.load

@BindingAdapter("setImage")
fun ImageView.setImage(url: String?) {
    Log.i("BindingAdapter", url ?: "")
    this.load(
        url
            ?: "https://t4.ftcdn.net/jpg/00/65/77/27/240_F_65772719_A1UV5kLi5nCEWI0BNLLiFaBPEkUbv5Fv.jpg"
    )
}

@BindingAdapter("setVisibility")
fun ProgressBar.setVisibility(loading: Boolean?) {
    if (loading == true) {
        this.visibility = VISIBLE
    } else {
        this.visibility = GONE
    }
}