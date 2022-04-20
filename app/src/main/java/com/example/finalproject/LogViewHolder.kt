package com.example.finalproject

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LogViewHolder(v: View) : RecyclerView.ViewHolder(v) {
    val descriptionVHolder: TextView
    val dateVHolder: TextView

    init {
        descriptionVHolder = v.findViewById(R.id.desc_row)
        dateVHolder = v.findViewById(R.id.date_row)
    }

    public fun bindTo(d: Log) {
        descriptionVHolder.text = d.description
        dateVHolder.text = d.timestamp.toString()
    }
}