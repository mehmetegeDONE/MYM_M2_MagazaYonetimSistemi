package ders7.alistirmalar

import ders7.alistirmalar.siniflar.FizikMotoru

fun main() {
    println("Saniye değeri gir: ")
    val saniye = readln().toDoubleOrNull()?: 0.0

    println(FizikMotoru.serbestDususSaniyesi(saniye))
}