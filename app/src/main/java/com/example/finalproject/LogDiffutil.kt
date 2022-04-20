package com.example.finalproject

import androidx.recyclerview.widget.DiffUtil

class LogDiffutil: DiffUtil.ItemCallback<Log>() {
    override fun areItemsTheSame(oldItem: Log, newItem: Log) =
        oldItem === newItem

    override fun areContentsTheSame(oldItem: Log, newItem: Log) =
        oldItem.description == newItem.description  &&
                oldItem.startLat == newItem.startLat  &&
                oldItem.startLong == newItem.startLong  &&
                oldItem.endLat == newItem.endLat  &&
                oldItem.endLong == newItem.endLong &&
                oldItem.timestamp == newItem.timestamp
}