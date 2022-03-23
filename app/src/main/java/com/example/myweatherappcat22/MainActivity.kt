package com.example.myweatherappcat22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.myweatherappcat22.databinding.ActivityMainBinding
import com.example.myweatherappcat22.views.ForecastDetailsFragment.Companion.newInstance
import com.example.myweatherappcat22.views.ForecastFragment
import com.example.myweatherappcat22.views.SearchCityFragment.Companion.newInstance

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        fragmentNavigation(supportFragmentManager, ForecastFragment.newInstance())

        val navController = findNavController(R.id.frag_nav_container)
        setupActionBarWithNavController(navController)
    }

}