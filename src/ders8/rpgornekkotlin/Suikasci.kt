package ders8.rpgornekkotlin

class Suikasci(isim: String, saglik: Int = 40) : Oyuncu(isim, saglik) {
    fun gizlen(){
        println("$isim gizlendi...")
    }
}