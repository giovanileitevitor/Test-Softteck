package com.githubexplorer.features.core.utils.presentation.livedata

import androidx.lifecycle.MutableLiveData

interface LiveDataFactory {
    fun <T : Any> mutableLiveData(): MutableLiveData<T>
}