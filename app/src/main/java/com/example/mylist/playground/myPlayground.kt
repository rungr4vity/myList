package com.example.mylist.playground
import com.example.mylist.classes.Dog
import com.example.mylist.playground.object_companion.apple
import com.example.mylist.playground.object_companion.apple_class

fun main()  {
        //val myList = mutableListOf<String>("Francsico","Martin","Ramos")



    fun getInfo(value: Int?,arreglo: Array<String>): Int {

        if(value == null) { return 0 }

        var final: String = ""
        for(item in arreglo){

            final =   item + final

        }
        println(final)
        return 1
    }

    print(getInfo(1, arrayOf("a","b","c","d")))


}