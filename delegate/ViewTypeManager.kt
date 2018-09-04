package com.boodskapper.core.adapter.delegate

interface ViewTypeManager {
    fun getItemViewType(position: Int): ViewType
}