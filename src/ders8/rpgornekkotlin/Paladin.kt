package ders8.rpgornekkotlin

class Paladin(isim: String, saglik: Int = 70) : Oyuncu(isim, saglik), BuyuKullanabilir, KalkanKullanabilir {
    override fun kalkanKullan() {
        println("$isim kalkan kullandı!")
    }

    override fun buyuYap() {
        println("$isim büyü yapıyor...")
    }
}