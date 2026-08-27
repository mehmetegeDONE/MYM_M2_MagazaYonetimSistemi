package ders9.try_catch

fun main() {

    println("Bir değer girin: ")
    var deger: Int
    try {
        deger = readln().toInt()
    } catch (e: Exception) {
        println("HATALI DEĞER GİRDİNİZ! (OTOMATİK 10 YAPILIYOR)")
        deger = 10
    } finally {
        println("Değer girilmiştir...")
    }

    println(deger)



}