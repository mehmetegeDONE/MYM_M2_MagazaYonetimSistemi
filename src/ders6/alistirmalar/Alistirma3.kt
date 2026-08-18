package ders6.alistirmalar

import ders6.alistirmalar.siniflar.BankaHesabi

fun main() {
    val hesap = BankaHesabi()

    print("Yatırmak istediğiniz tutar: ")
    val yatirilanTutar = readln().toDoubleOrNull()?: 0.0
    hesap.paraYatir(yatirilanTutar)

    print("Çejmek istediğiniz tutar: ")
    val cekilecekTutar = readln().toDoubleOrNull()?: 0.0
    hesap.paraCek(cekilecekTutar)

    println("Güncel bakiye ${hesap.bakiyeSorgula()}")
}