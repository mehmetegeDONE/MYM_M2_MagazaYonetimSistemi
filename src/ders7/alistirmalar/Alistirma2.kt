package ders7.alistirmalar

import ders7.alistirmalar.siniflar.Kullanici

fun main() {
    print("Lütfen isminizi girin: ")
    val isim = readln().trim()

    print("Özel bir yetki rolünüz var mı? (E/H)")
    val yetki = readln().trim().first()

    var kullanici1 = Kullanici(isim)

    if (yetki.equals('E',true)){
        print("Rolünüzü girin: ")
        val rolu = readln().trim()

        kullanici1 = Kullanici(isim,rolu)
    }

    println("Kullanıcı adi: ${kullanici1.kullaniciAdi}")
    println("Kullanıcı rolü: ${kullanici1.rol}")
}