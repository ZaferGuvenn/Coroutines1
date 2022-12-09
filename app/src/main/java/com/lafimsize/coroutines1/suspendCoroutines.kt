package com.lafimsize.coroutines1

import kotlinx.coroutines.*

fun main(){


    //myFunction direkt çağırılmaz çünkü suspendi suspendde ancak çağırabilirsin. yani durdurulabilir func.
    runBlocking {
        delay(2000)
        println("run blocking")
        myFunction()
    }

}

suspend fun myFunction(){
    //coroutineScope ancak suspend functa çalıştırılabilir. Yani durdurulabilir fonk.
    coroutineScope {
        delay(4000)
        println("suspend func")
    }
}