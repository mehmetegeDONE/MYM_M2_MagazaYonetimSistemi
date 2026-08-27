package ders9.alistirmalar.alistirma1

fun main() {
    /*
    Yolcuların adını (String), koltuk numarasını (String) ve VIP üyelik durumunu (Boolean) tutacak bir Yolcu veri sınıfı (data class) oluşturun.
    Kullanıcıdan konsol üzerinden yolcu adını ve koltuk numarasını alarak VIP durumu başlangıçta “false” olan bir nesne yaratın.
    Ardından, nesnenin asıl yapısını bozmadan, sadece koltuğunu “1A” yapıp VIP durumunu “true”ya
    yükselttiğiniz yeni bir yolcu nesnesi kopyalayıp her iki nesneyi de ekrana yazdırın.
    */

    print("Yolcu Adını Girin: ")
    val yolcuAdiGirdi = readln().trim()

    val yolcuAdi = if (yolcuAdiGirdi.isEmpty()) "Isımsiz Yolcu" else yolcuAdiGirdi

    print("Koltuk Numarasını Girin: ")
    val yolcuKoltukNum = readln().trim().uppercase()

    val standartYolcu = Yolcu(yolcuAdi,yolcuKoltukNum,false)
    val vipYolcu = standartYolcu.copy(koltukNumara = "1A", vipDurumu = true)

    println("STANDART: " + standartYolcu)
    println("VİP: " + vipYolcu)

}