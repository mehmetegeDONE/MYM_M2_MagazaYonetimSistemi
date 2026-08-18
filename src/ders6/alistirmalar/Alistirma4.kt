package ders6.alistirmalar

import ders6.alistirmalar.siniflar.KullaniciHesabi

fun main() {
    val profil = KullaniciHesabi()

    print("Yeni şifrenizi girin: ")
    val kullanilanSifre = readln()
    profil.sifre = kullanilanSifre

    println("Şifrenin son hali ${profil.sifre} mailinize gönderilmiştir")
}