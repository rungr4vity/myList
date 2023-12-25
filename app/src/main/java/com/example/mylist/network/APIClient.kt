package com.example.mylist.network

import com.example.mylist.protocols.retrofitService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofitclient {


    private fun getRetrofit():Retrofit{

        return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


    val api = getRetrofit().create(retrofitService::class.java)


}