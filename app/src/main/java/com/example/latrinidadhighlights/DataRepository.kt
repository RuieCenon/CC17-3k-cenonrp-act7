package com.example.latrinidadhighlights

class DataRepository {
    fun getCulturalAttractions(): List<Attraction> = DataSource.culturalAttractions
    fun getOutdoorActivities(): List<Farms> = DataSource.activities
    fun getDiningOptions(): List<Eats> = DataSource.eatsOptions
    fun getShoppingExperiences(): List<Others> = DataSource.othersExperiences
}
