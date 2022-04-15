package com.example.finalproject

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.finalproject.databinding.ActivityListLocationsBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListLocations : AppCompatActivity() {
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

        var individualLocationLauncher  = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val data: Intent? = result.data
            }
        }

        testButton.setOnClickListener{
            val intent = Intent(this@ListLocations, IndividualLocation::class.java)
            individualLocationLauncher.launch(intent)
        }
    }
}