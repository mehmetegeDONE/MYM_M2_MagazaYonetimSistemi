package ders8.rpgornekkotlin

class Buyucu(isim: String, saglik: Int = 50) : Oyuncu(isim, saglik), BuyuKullanabilir{
    override fun buyuYap() {
        println("$isim büyü yapıyor...")
    }

}