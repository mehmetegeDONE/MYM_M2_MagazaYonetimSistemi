package ders8.alistirmalar.alistirma1

/*
Calisan adında kalıtıma açık (open) bir ata sınıf oluşturun.
Girişinde (Constructor) isim (String) ve maas (Double) özelliklerini alsın.
İçine geriye Double maaş değerini döndüren açık (open) bir maasHesapla() metodu yazın.
Ardından bu sınıfı miras alan Yonetici adında bir yavru sınıf tasarlayın.
Yonetici sınıfı constructor anında ek
 olarak bir prim (Double) özelliği alabilsin.
Yönetici sınıfı içinde maasHesapla() metodunu ezerek (override) geriye temel maaş ile prim toplamını döndürsün.
main içinde kullanıcıdan yönetici adı, maaşı ve prim bilgilerini alarak nesneyi üretip nihai maaş sonucunu ekrana yazdırın.
*/

fun main() {
    print("Yöneticinin adını soyadını girin: ")
    val adSoyad = readln().trim()

    print("Yöneticinin maasını girin: ")
    val maas = readln().toDoubleOrNull()?: 0.0

    print("Yöneticinin prim miktarını girin: ")
    val prim = readln().toDoubleOrNull()?: 0.0

    val yonetici1 = Yonetici(adSoyad,maas,prim)

    println("Yönetici Ismi: " + yonetici1.isim)
    println("Ödenecek Tutar: " + yonetici1.maasHesapla())
    println("Prim Miktarı: " + yonetici1.prim)
}