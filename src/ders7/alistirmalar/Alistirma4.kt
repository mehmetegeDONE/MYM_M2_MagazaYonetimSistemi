package ders7.alistirmalar

import ders7.alistirmalar.siniflar.Calisan

fun main() {

    val calisanlar = mutableListOf<Calisan>()

    for (i in 1..3){
        print("${i}. Calisan adini girin: ")
        val calisanAd = readln()
        val calisan = Calisan(calisanAd)
        calisanlar.add(calisan)
    }

    for (calisan in calisanlar){
        println("${calisan.isim}")
    }
    println("Bu şirkette toplam çalışan sayısı: " + Calisan.toplamCalisanSayisi)
}