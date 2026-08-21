package ders8.Inheritance

fun main() {
    val kedi = Kedi()
    kedi.ad = "Tekir"
    kedi.yas = 2

    kedi.beslen()
    println("${kedi.ad}'ın yaşı: " + kedi.yas)

    val kopek = Kopek()

}