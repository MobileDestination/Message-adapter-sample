package com.boodskapper.core.adapter

import com.boodskapper.core.presentation.ItemView

interface ItemViewPresenter<V : ItemView> {
    fun present(view: V, position: Int)
}