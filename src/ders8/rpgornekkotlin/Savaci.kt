package ders8.rpgornekkotlin

class Savaci(isim: String, saglik: Int = 120) : Oyuncu(isim, saglik), KalkanKullanabilir{
    override fun kalkanKullan() {
        println("$isim kalkan kullandı!")
    }

}