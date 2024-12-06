package com.example.latrinidadhighlights

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

sealed interface Item : Parcelable {
    val name: String
    val imageResId: Int
}

@Parcelize
data class Attraction(
	override val name: String,
	val description: String,
	val location: String,
	val hours: String,
	override val imageResId: Int
) : Item

@Parcelize
data class Farms(
	override val name: String,
	val description: String,
	val location: String,
	val time: String,
	override val imageResId: Int
) : Item

@Parcelize
data class Eats(
	override val name: String,
	val specialty: String,
	val location: String,
	val time: String,
	override val imageResId: Int
) : Item

@Parcelize
data class Others(
	override val name: String,
	val description: String,
	val location: String,
	override val imageResId: Int
) : Item
