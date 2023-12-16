package com.example.mylist.protocols

import retrofit2.http.GET

interface retrofitService {

    @GET("https://jsonplaceholder.typicode.com/")
    suspend fun getInfo()
}