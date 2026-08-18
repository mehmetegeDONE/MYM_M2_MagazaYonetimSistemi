package ders6.alistirmalar

import ders6.alistirmalar.siniflar.AkilliTelefon

fun main() {

    /*
    Ana Program (main) Akışı: Sınıftan bir nesne üretin. Sonsuz bir döngü başlatarak kullanıcıdan her adımda girdi alın.
    Kullanıcı
    1 girdiğinde telefonu açan,
    2 girdiğinde oyunu başlatan,
    3 girdiğinde ise uygulamayı kapatan yönlendirme algoritmasını yazın.
     */

    val cihazim = AkilliTelefon()

    println("=== Akıllı Telefon Program ===")

    while (true){
        println()
        print("İşlem seçiniz: \n1.Aç\n2.Oyun Oyna\n3.Çıkış: \nİşlemi seçin ->")
        val secim = readln().trim()

        when(secim){
            "1" -> cihazim.telefonuAc()
            "2" -> cihazim.oyunOyna()
            "3" -> {
                println("Panel Kapatılıyor...")
                cihazim.acikMi = false
                break
                }
            else -> println("Geçersiz seçim!")
        }
    }
}