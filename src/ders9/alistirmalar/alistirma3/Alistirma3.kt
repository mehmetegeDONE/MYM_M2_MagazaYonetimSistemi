package ders9.alistirmalar.alistirma3

fun main() {
    /*
    Bir evdeki 5 odadan gelen sıcaklık değerlerini tutan ondalıklı sayılardan oluşmuş sabit bir liste oluşturun.
    Kullanıcıdan tehlike sınırını belirleyecek bir eşik sıcaklık derecesi (Double) isteyin (çökme korumasıyla).
    Listenin içinden bu eşik değerinden yüksek olan sıcaklıkları süzün.
    Süzülen değerleri “Yüksek Sıcaklık Uyarısı: X derece!” şeklinde uyarı metinlerine dönüştürüp döngüsüz bir şekilde ekrana listeleyin.
    */

    val odaSicakliklari = mutableListOf<Double>(18.2, 22.3, 25.3, 32.7, 28.1)

    println("Odaların anlık sıcaklıkları $odaSicakliklari")

    println("Eşik sıcaklık derecesi: ")
    val esikSicaklik = readln().toDoubleOrNull() ?: 25.0

    val esikSicakliklar = odaSicakliklari
                    .filter { it > esikSicaklik }
                    .map { it -> "YÜKSEK SICAKLIK UYARISI!!! : $it derece.." }
                    .forEach { println(it) }

}