package com.example.finalproject

import org.joda.time.DateTime

data class Log(val description: String, val startLat: Double,
               val startLong: Double, val endLat: Double,
               val endLong: Double, val timestamp: DateTime)