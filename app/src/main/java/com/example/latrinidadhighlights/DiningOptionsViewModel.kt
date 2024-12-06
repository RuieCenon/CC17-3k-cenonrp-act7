package com.example.latrinidadhighlights

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiningOptionsViewModel(private val repository: DataRepository = DataRepository()) : ViewModel() {
    private val _eatsOptions = MutableLiveData<List<Eats>>()
    val eatsOptions: LiveData<List<Eats>> = _eatsOptions

    init {
        loadDiningOptions()
    }

    private fun loadDiningOptions() {
        _eatsOptions.value = repository.getDiningOptions()
    }
}
