package com.lafimsize.coroutines1

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    runBlocking {
        /*launch (Dispatchers.Main){
            println("Main thread: "+Thread.currentThread().name.toString())
        }*///Main threadı ancak main activity içinde çalıştırabiliriz.

        launch (Dispatchers.IO){
            println("IO thread: "+Thread.currentThread().name.toString())
        }

        launch (Dispatchers.Default){
            println("Default thread: "+Thread.currentThread().name.toString())
        }

        launch (Dispatchers.Unconfined){
            println("Unconfined thread: "+Thread.currentThread().name.toString())
        }
    }
}