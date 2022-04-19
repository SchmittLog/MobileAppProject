package com.example.finalproject

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListLocations : AppCompatActivity() {
    private var latitude = 0.0
    private var longitude = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_locations)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener{ view ->
            val intent = Intent()
            setResult(RESULT_OK, intent)
            finish()
        }

        //temp button to move to detailed entry screen
        val testButton = findViewById<Button>(R.id.tempBtn)
        val lat = findViewById<TextView>(R.id.Latitude)
        val lon = findViewById<TextView>(R.id.Longitude)

        var individualLocationLauncher  = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val data: Intent? = result.data
            }
        }

        testButton.setOnClickListener{
            val intent = Intent(this@ListLocations, MapsActivity::class.java)
            latitude = lat.text.toString().toDouble()
            longitude = lon.text.toString().toDouble()
            intent.putExtra("latitude", latitude)
            intent.putExtra("longitude", longitude)
            individualLocationLauncher.launch(intent)
        }
    }
}