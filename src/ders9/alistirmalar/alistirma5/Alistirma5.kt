package ders9.alistirmalar.alistirma5

fun main() {
    /*
    Çalışanın adını ve maaşını (Double) tutan bir Calisan veri sınıfı (data class) yazın ve 3 çalışandan oluşan esnek bir liste oluşturun.
    Kullanıcıdan yapılacak zam oranını yüzde olarak isteyin (Örn: %10 zam için 10.0 girilecek).
    Listeyi dönüştürme fonksiyonuyla dönerek, her çalışanın orijinal yapısını bozmadan maaşını girilen oranda artıran
    ve kopyalayan güncel maaş listesini elde edip ekrana yazdırın.
     */

    val calisanlar = listOf(
        Calisan("Ahmetcan Yıldırım", 80000.00),
        Calisan("Bahar Akasoy", 120000.00),
        Calisan("Ahmetcan Yıldırım", 1000000.00)
    )

    calisanlar
        .forEach { println("Ad: ${it.ad} -> Maaş: ${it.maas}TL") }

    println("Zam oranını yüzde olarak giriniz: ")
    val zamOrani = readln().toDoubleOrNull()?: 0.0

    println("------------------------------------------------")
    calisanlar
        .map {
        val yeniMaas = it.maas + (it.maas * zamOrani / 100)
        it.copy(maas = yeniMaas)}
        .forEach { println("Ad: ${it.ad} -> Yeni Maaş: ${it.maas}TL") }
}