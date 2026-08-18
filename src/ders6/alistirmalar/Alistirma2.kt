package ders6.alistirmalar

import ders6.alistirmalar.siniflar.Ogrenci

fun main() {
    /*
    Bir öğrenci nesnesi üretin.
    Kullanıcıdan öğrencinin adını isteyip nesnenin özelliğine atayın.
    Ardından kullanıcıdan konsol üzerinden sırayla 3 sınav notu girmesini isteyin
    (girdilerin sayısal olmama durumunu denetleyip koruma uygulayın). Her girdi için notEkle() metodunu çağırın.
     Son aşamada öğrencinin adını, notlarını ve ortalamasını ekrana yazdırın.
     */
    val ogrenci = Ogrenci()

    print("Öğrencinin adını giriniz: ")
    val ogrenciAdi = readln().trim()

    for (i in 1..3){
        print("${i}. Sınav notunu giriniz: ")
        val sinavNot = readln().toIntOrNull()?: 0
        ogrenci.notEkle(sinavNot)
        println()
    }

    val ortalama = ogrenci.ortalamaHesapla()

    println("Ogrenci: $ogrenciAdi")
    println("Notlar: ${ogrenci.notlar}")
    println("Ortalama: ${"%.2f".format(ortalama)}")
}