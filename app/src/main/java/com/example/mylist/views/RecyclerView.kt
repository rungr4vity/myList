package com.example.mylist.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.navigation.ui.AppBarConfiguration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mylist.R
import com.example.mylist.databinding.ActivityMainBinding
import com.example.mylist.models.Items
import com.example.mylist.network.Retrofitclient
import com.example.mylist.theAdapter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RecyclerView : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_recycler_view)

        /*
        val dataList = listOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5") // Your data
        val recyclerView: RecyclerView = binding.root.findViewById<RecyclerView>(R.id.reciclerViewMain)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = theAdapter(dataList)
        recyclerView.adapter = adapter
        */
    }

    fun getInfo() {

        val retro = Retrofitclient.api.getInfo()

        retro.enqueue(object : Callback<List<Items>> {
            override fun onResponse(call: Call<List<Items>>, response: Response<List<Items>>) {
                Toast.makeText(this@RecyclerView,"OK", Toast.LENGTH_LONG).show()

                Log.d("Json_response",response.body().toString())
            }

            override fun onFailure(call: Call<List<Items>>, t: Throwable) {
                Toast.makeText(this@RecyclerView,"Error", Toast.LENGTH_LONG).show()
            }

        })
    }

    fun execute(){
        CoroutineScope(Dispatchers.IO).launch {
            getInfo()
        }
    }
}