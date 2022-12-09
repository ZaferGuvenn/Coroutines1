package com.lafimsize.coroutines1

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

var userName="null"
var age=0

fun main(){

    //async veri çekerken işlemler bittiğinde bunları yap anlamında kullanılır. Wait for signal gibi...



    runBlocking {
        val downloadedName=async {
            userName= downloadName()
        }
        val downloadedAge=async {
            age= downloadAge()
        }





        launch {
            downloadedAge.await()
            downloadedName.await()
            println(userName+" "+ age)
        }




    }


}

suspend fun downloadName(): String {
    delay(2000)
    val userNameLocal="Zafer"
    println("log: Username downloaded..")
    return userNameLocal
}

suspend fun downloadAge():Int{
    delay(3000)
    val ageLocal=24
    println("log: Age downloaded..")
    return ageLocal
}