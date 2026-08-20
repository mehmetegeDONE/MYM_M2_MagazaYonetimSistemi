package ders7.alistirmalar

import ders7.alistirmalar.siniflar.Kitap

fun main() {

    println("Lütfen yeni sayfa sayısını girin: ")
    val yeniSayfaSayisi = readln().toIntOrNull()?: 0

    var kitap1 = Kitap("Meh","Ege",yeniSayfaSayisi)
    println(kitap1.ad)
    println(kitap1.yazar)
    println(kitap1.sayfaSayisi)


    

}