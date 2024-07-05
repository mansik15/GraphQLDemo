package com.app.graphqldemo

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.graphqldemo.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    val viewModel: MainViewModel by viewModels()
    val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        viewModel.getCountries("AS")
        setObservers()
    }

    private fun setObservers() {
        lifecycleScope.launch {
            viewModel.countriesResponse.observe(this@MainActivity) { countryResponse ->
                Log.d("Name: ", countryResponse[0].name)
                var countryAdapter = CountryAdapter(this@MainActivity, countryResponse)
                binding.rvCountries.adapter = countryAdapter
            }
        }

    }
}