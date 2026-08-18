package ders6.alistirmalar.siniflar

/*
AkilliTelefon adında bir sınıf oluşturun ve içerisine şu kuralları tanımlayın:

Sınıf Özellikleri: marka (String, varsayılan değeri “LeaderPhone”), pilYuzdesi (Int, varsayılan değeri 100) ve acikMi (Boolean, varsayılan değeri false) özelliklerini tanımlayın.
telefonuAc() Metodu: Parametre almaz ve değer döndürmez. Eğer cihaz zaten açık durumdaysa ekrana “Uyarı: Telefon zaten açık!” yazdırır. Cihaz kapalıysa durumunu açık (true) yapar ve ekrana “Sistem: Telefon açıldı. Ekrana hoş geldiniz.” mesajını basar.
oyunOyna() Metodu: Parametre almaz ve değer döndürmez. Eğer cihaz kapalıysa ekrana “Hata: Önce telefonu açmalısın!” yazdırır.
Cihaz açıksa ve pil yüzdesi 10’dan büyükse,
pil yüzdesini 10 eksiltir ve ekrana “Sistem: Oyun oynanıyor… Yeni pil seviyesi: %X” yazdırır. Pil yüzdesi 10 veya daha azsa “Uyarı: Şarj bitiyor! Pil seviyesi çok düşük, oyun açılamaz.” mesajını gösterir.
 */

class AkilliTelefon{

    val marka : String = "LeaderPhone"
    var pilYuzdesi : Int = 100
    var acikMi : Boolean = false

    fun telefonuAc(){
        if (acikMi){
            println("Uyarı telefon zaten açık!")
        } else {
            acikMi = true
            println("Marka ${marka}, hoşgeldiniz.")
        }
    }

    fun oyunOyna(){
        if (!acikMi){
            println("Hata: Önce telefonu açmalısın!")
        } else if (pilYuzdesi > 10){
            pilYuzdesi -= 10
            println("Sistem: Oyun oynanıyor… Yeni pil seviyesi: ${pilYuzdesi}” yazdırır.")
        } else {
            println("Uyarı: Şarj bitiyor! Pil seviyesi çok düşük, oyun açılamaz.")
        }
    }
}