package com.app.graphqldemo.remote

import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.network.okHttpClient

val apolloClient = ApolloClient.Builder()
    .serverUrl("https://countries.trevorblades.com")
    .build()