package com.lafimsize.coroutines1

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main(){
    //withContext ile io daki veriyi diyelim mainde göstermek için kullanırsın. Yani dispatcher arası geçiş için kullanılır.
    //burada main sıkıntı çıkmasın diye default yaptık.
    runBlocking {
        launch(Dispatchers.Default) {
            println("Context: ${coroutineContext}")
            withContext(Dispatchers.IO){
                println("Context2: ${coroutineContext}")
            }
        }
    }

}