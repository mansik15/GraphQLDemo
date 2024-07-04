package com.app.graphqldemo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.graphqldemo.remote.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val mainRepository: MainRepository): ViewModel() {

    val countriesResponse = MutableLiveData<List<FindCountriesOfAContinentQuery.Country>>()

    fun getCountries(continentCode: String) {
        viewModelScope.launch {
            val apiResponse = mainRepository.getCountriesOfSelectedContinent(continentCode)
            if (!apiResponse.hasErrors()) {
                countriesResponse.value = apiResponse.data?.continent?.countries
            }else{
                Log.d("Error: ", apiResponse.errors.toString())
            }
        }

    }
}