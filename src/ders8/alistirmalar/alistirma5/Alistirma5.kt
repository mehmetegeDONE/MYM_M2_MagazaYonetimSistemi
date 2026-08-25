package ders8.alistirmalar.alistirma5


fun main() {
    println("Kullanıcı adınızı girin: ")
    val ad = readln().trim()

    println("Kullanıcı yetkisini girin (varsa):")
    val yetki = readln().toIntOrNull()?: 0




    val yoneticiKullanici = YoneticiKullanici(ad,yetki)
    println()
    println(yoneticiKullanici.ad)
    println(yoneticiKullanici.yetkiSeviye)

}