package com.lafimsize.coroutines1

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    //launch u bir val'a eşitlediğimizde o val bir job olur. Ancak yine de çalıştırılır. myjob.cancel ile sonlandırılabilir.

    runBlocking {

        val myJob=launch {
            delay(2000)
            println("job")

            val myjob2=launch {
                println("job2")
            }
        }

        myJob.invokeOnCompletion {
            println("my job end..")
        }

        //myJob.cancel()

    }
}