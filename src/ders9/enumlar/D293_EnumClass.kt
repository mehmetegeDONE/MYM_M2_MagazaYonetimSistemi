package ders9.enumlar

fun main() {
    val isik = TrafikIsigi.KIRMIZI

    when(isik){
        TrafikIsigi.KIRMIZI -> println("Dur")
        TrafikIsigi.SARI -> println("Bekle")
        TrafikIsigi.YESIL -> println("Git")
    }
}