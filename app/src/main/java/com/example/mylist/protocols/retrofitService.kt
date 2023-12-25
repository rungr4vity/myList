package com.example.mylist.protocols

import com.example.mylist.models.Items
import retrofit2.Call
import retrofit2.http.GET

interface retrofitService {
    @GET("posts")
    fun getInfo(): Call<List<Items>>


}