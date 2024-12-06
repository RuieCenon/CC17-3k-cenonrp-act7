package com.example.latrinidadhighlights

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OthersExperiencesViewModel(private val repository: DataRepository = DataRepository()) : ViewModel() {
    private val _othersExperiences = MutableLiveData<List<Others>>()
    val othersExperiences: LiveData<List<Others>> = _othersExperiences

    init {
        loadShoppingExperiences()
    }

    private fun loadShoppingExperiences() {
        _othersExperiences.value = repository.getShoppingExperiences()
    }
}
