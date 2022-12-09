package com.lafimsize.coroutines1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lafimsize.coroutines1.databinding.ActivityMainBinding
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        //var i=0
/*
        GlobalScope.launch {
            var i=0
            repeat(10000){
                launch {
                    i=i+1
                    println("zafer=${i}")
                }
            }
        }
*/
        //1==========RUN BLOCKİNG
/*RUN BLOCKİNGGGG
        println("run blocking start")
        runBlocking {
            launch {
                delay(10000)
                println("run blocking..")

            }
        }
        println("run blocking stop")//yukarıdaki işlem için bu işlem blocklandı...

RUN BLOCKİNGGGG END
*/
        //2=========GLOBAL SCORE
/*
Global scope starttttt

     println("globale scope start")
     GlobalScope.launch {
         delay(5000)
         println("Global Scope İçindeki İşlem Gerçekleşiyor..")
     }

     println("global scope end")//yukarıdaki işlem blocklanmaz bu işlem olur yukardaki beklenmeden...

global scope enddddd
*/
        //3============COROTUİNE SCOPE
/*
Corotine scope start

        println("coroutine scope start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("coroutine scope işlemi..")
        }
        println("coroutine scope end")//global scope gibi işlenir.

Corotine scope end
*/
//devamı scope coroutine.kt fileındadır..
//
        //DISPATCHERSSSSS....
        runBlocking {
            launch (Dispatchers.Main){
                println("Main thread: "+Thread.currentThread().name.toString())
            }

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
    }//onCreate()..

}