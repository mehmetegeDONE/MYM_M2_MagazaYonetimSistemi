package ders8.rpgornekkotlin

open class Oyuncu (
    var isim: String,
    var saglik: Int = 100
){

    init {
        isim = isim.first().uppercase() + isim.substring(1)
    }


    fun hasarAl(){
        println("${isim} hasar aldı!")
        println("Canı $saglik -> ${saglik - 10}")
        if (saglik <= 0){
            println("${isim.first().uppercase() + isim.substring(1)} öldü!")
        }
    }
}