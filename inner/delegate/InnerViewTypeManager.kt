package com.boodskapper.core.adapter.inner.delegate

import com.boodskapper.core.adapter.delegate.ViewType

interface InnerViewTypeManager {
    fun getItemViewType(parentPosition: Int, position: Int): ViewType
}