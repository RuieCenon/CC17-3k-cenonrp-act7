package com.example.latrinidadhighlights

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _categories = MutableLiveData<List<Category>>()
    val categories: LiveData<List<Category>> = _categories

    init {
        loadCategories()
    }

    private fun loadCategories() {
		/*
		val categoryList = listOf(
			Category("Cultural Attractions", R.drawable.bell),
			Category("Farm Highlights", R.drawable.yangbew),
			Category("Cafes and Restos", R.drawable.zambali),
			Category("Other Experiences", R.drawable.adivay)
		)
		 */
		val categoryList = listOf(
			Category("Cultural Attractions", R.drawable.arcamuseum),
			Category("Farm Highlights", R.drawable.strawberry_farm),
			Category("Cafes and Restos", R.drawable.zambali),
			Category("Other Experiences", R.drawable.adivay)
		)


        _categories.value = categoryList
    }
}
