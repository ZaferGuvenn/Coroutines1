package com.lafimsize.coroutines1

import kotlinx.coroutines.*

fun main(){

    runBlocking {
        launch {
            delay(5000)
            println("run blocking..")
        }

        coroutineScope {
            launch {
                delay(2000)
                println("coroutine scope..")
            }
        }
    }//ilk olarak en az süreli olan çalışır. run blocking içindekini blocklamaz..

}