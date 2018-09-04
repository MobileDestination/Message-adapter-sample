package com.boodskapper.core.adapter.inner

interface InnerProvider {
    fun getItemCount(parentPosition: Int): Int
    fun getItemTop(parentPosition: Int): Int
}