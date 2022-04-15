
package com.example.finalproject

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addButton = findViewById<Button>(R.id.AddEntryBtn)
        val listButton = findViewById<Button>(R.id.SeeEntriesBtn)

        var addLocationLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val data: Intent? = result.data
            }
        }

        var listLocationLauncher  = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val data: Intent? = result.data
            }
        }

        addButton.setOnClickListener{
            val intent = Intent(this@MainActivity, AddLocation::class.java)
            addLocationLauncher.launch(intent)
        }

        listButton.setOnClickListener{
            val intent = Intent(this@MainActivity, ListLocations::class.java)
            listLocationLauncher.launch(intent)
        }


    }


}