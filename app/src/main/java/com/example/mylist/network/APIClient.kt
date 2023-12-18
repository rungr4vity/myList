package com.example.mylist.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

public class APIClient {


    private fun getRetrofit():Retrofit{

        return Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


}