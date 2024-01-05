package com.example.mylist.playground
import com.example.mylist.classes.Dog
import com.example.mylist.playground.object_companion.apple
import com.example.mylist.playground.object_companion.apple_class

fun main() {

    var items = listOf<Int>(1,2,3,5,7)



    var mysecond = items.filter { it % 2 == 0 }

    print(mysecond)
}





