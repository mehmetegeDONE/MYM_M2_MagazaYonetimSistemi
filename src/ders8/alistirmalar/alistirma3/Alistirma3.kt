package ders8.alistirmalar.alistirma3

fun main() {
    println("Bir değer girin (1-Kamera, 2-Buzdolabi): ")
    val secim = readln().trim().ifEmpty { "Geçersiz" }

    when(secim){
        "1" -> AkilliKamera().interneteBaglan()
        "2" -> AkilliBuzdolabi().interneteBaglan()
        else -> println("HATALI GİRİS! EVİNİZDE BÖYLE BİR CİHAZ YOK")
    }
}