package com.appsophos2.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.GoogleMap
import androidx.activity.viewModels
import com.appsophos2.databinding.ActivityMainBinding
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment

// poner la class MainActivity desoues de organizarlo asi: class MainActivity : AppCompatActivity(), OnMapReadyCallback {
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var map:GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
*/
        //binding.viewContainer.setOnClickListener{}
    }

    /*override fun onMapReady(map: GoogleMap) {
        this.map = map
    }*/
}