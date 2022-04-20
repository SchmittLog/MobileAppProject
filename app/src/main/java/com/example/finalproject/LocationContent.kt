package com.example.finalproject

import org.joda.time.DateTime
import java.util.ArrayList


object LocationContent {
    val ITEMS: MutableList<LocationItem> = ArrayList()

    fun addItem(item: LocationItem) {
        ITEMS.add(item)
    }

    data class LocationItem(val description: String, val startLat: Double,
                           val startLong: Double, val endLat: Double, val endLong: Double,
                           val timestamp: DateTime
    )

    /*
    {
        override fun toString(): String {
            return "$fromVal $fromUnits = $toVal $toUnits"
        }
    } */
}