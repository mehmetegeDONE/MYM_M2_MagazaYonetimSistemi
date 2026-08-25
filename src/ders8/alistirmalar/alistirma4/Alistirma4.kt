package ders8.alistirmalar.alistirma4

fun main() {

    do {
        println("(0: Çıkış 1: İlerle, 2: Şarj Et)")
        print("Seçim yap: ")
        val secim = readln()

        val elektrikliOtonomArac = ElektrikliOtonomArac()

        when(secim){
            "1" -> elektrikliOtonomArac.ilerle()
            "2" -> elektrikliOtonomArac.sarjEt()
            "0" -> break
            else -> {
                println()
                println("HATA: Olmayan bir seçenek seçtiniz.")
                println()
            }
        }
    } while (true)

    println("-/--/--/-ÇIKIŞ YAPILDI---/--/--/-")


}