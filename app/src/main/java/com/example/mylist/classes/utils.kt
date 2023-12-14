package com.example.mylist.classes

import android.content.Context
import androidx.core.content.getSystemService

class utils {

    fun checkInternet(context: Context): Boolean {

        val connectivityManager  = context.getSystemService(Context.CONNECTIVITY_SERVICE)

        return true
    }
}