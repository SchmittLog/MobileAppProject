package com.example.finalproject

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
//import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.finalproject.LocationContent.addItem
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.material.floatingactionbutton.FloatingActionButton
import org.joda.time.DateTime

/* import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.finalproject.databinding.ActivityAddLocationBinding */

class AddLocation : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_location)
        setSupportActionBar(findViewById(R.id.toolbar))

        val desc = findViewById<TextView>(R.id.txtDescription)
        val startlat = findViewById<TextView>(R.id.txtStartLat)
        val startlong = findViewById<TextView>(R.id.txtStartingLong)
        val endlat = findViewById<TextView>(R.id.txtEndingLat)
        val endlong = findViewById<TextView>(R.id.txtEndingLong)

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener{ view ->
            val intent = Intent()
            setResult(RESULT_OK, intent)
            val item = LocationContent.LocationItem(desc.text.toString(), startlat.text.toString().toDouble(), startlong.text.toString().toDouble(),
                endlat.text.toString().toDouble(), endlong.text.toString().toDouble(),
                DateTime.now())
            addItem(item)
            finish()
        }
    }
}