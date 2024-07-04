package com.app.graphqldemo.remote

import com.app.graphqldemo.FindCountriesOfAContinentQuery

class MainRepository {

    suspend fun getCountriesOfSelectedContinent(continentCode: String) = apolloClient.query(
        FindCountriesOfAContinentQuery(continentCode)
    ).execute()

}