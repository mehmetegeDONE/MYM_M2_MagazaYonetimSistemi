package ders7.alistirmalar

import ders7.alistirmalar.siniflar.Etkinlik

fun main() {

    val etkinlik1 = Etkinlik("Dogum Günü Etkinliği", -23,-23)

    println(etkinlik1.etkinlikAd)
    println("Baslangic : " + etkinlik1.baslangicSaati)
    println("Bitis : " + etkinlik1.bitisSaati)
}