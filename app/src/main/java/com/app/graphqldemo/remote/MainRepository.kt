package com.app.graphqldemo.remote

import com.apollographql.apollo3.ApolloClient
import com.app.graphqldemo.FindCountriesOfAContinentQuery
import javax.inject.Inject

class MainRepository @Inject constructor(private val apolloClient: ApolloClient) {

    suspend fun getCountriesOfSelectedContinent(continentCode: String) = apolloClient.query(
        FindCountriesOfAContinentQuery(continentCode)
    ).execute()

}