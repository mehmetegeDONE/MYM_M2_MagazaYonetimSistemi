package ders7

import ders7.siniflar.Oyuncu

fun main() {
    val oyuncu1 = Oyuncu("Hero",-80) // Constructerda init ile can 100 olur
    println(oyuncu1.can)

    oyuncu1.can = -80 // -80 atadık bunu init engelleymez!
    println(oyuncu1.can) // candaki set metodu ile -80'i otomatik olarak 100 yapar
}