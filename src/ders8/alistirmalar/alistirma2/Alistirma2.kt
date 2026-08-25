package ders8.alistirmalar.alistirma2

fun main() {

    /*
    EvAleti adında kalıtıma açık (open) bir ata sınıf oluşturun ve constructor girişinde marka (String) özelliği alsın.
     İçine açık (open) bir calis() metodu ekleyin. Bu sınıfı miras alan Televizyon ve Utu adlarında iki adet yavru sınıf tasarlayın.
      Televizyon sınıfında calis() metodunu ezerek (override) ekrana “Televizyon açıldı, ekran taranıyor.” yazdırın.
       Utu sınıfında ise aynı metodu ezerek ekrana “Ütü ısınmaya başladı, buhar hazır!” yazdırın. main içinde kullanıcıya
       “1: TV, 2: Ütü” seçeneğini sunup, seçimine göre doğru nesneyi üretin ve calis() metodunu tetikleyin.
     */


    println("Ürüne marka girin lütfen")
    val markaGirdi = readln().trim()
    val marka = if (markaGirdi.isEmpty()) "Genel" else markaGirdi

    do {
    println("Bir secim yapın (Ütü 1.) (Televizyon 2.) : ")
    val secim = readln()

        when(secim){
            "1" -> {
                val tv = Televizyon(marka)
                tv.calis()
            }
            "2" -> {
                val utu = Utu(marka)
                utu.calis()
            }
            else -> {
                println("Geçersiz seçim!")
            }
        }
    } while (true)

}