package ders9.alistirmalar.alistirma2

fun main() {
    /*
    Kargo gönderi durumlarını temsil eden BEKLEMEDE, YOLDA ve TESLIM_EDILDI seçeneklerine sahip bir KargoDurumu adında Enum sınıfı oluşturun.
    Kullanıcıdan teslimat durumu için bir sayısal kod (1, 2 veya 3) isteyin.
    Gelen sayısal koda göre doğru Enum sabitini üreten ve
    ardından bu enum durumuna göre ekrana özelleştirilmiş kargo durum raporu mesajı yazdıran karar yapısını kurgulayın.
     */

    print("Bir sayı girin (1-BEKLEMEDE, 2-YOLDA, 3-TESLİM EDİLME): ")
    val secim = readln().toIntOrNull()

    val guncelDurum = when(secim){

        1 -> KargoDurumu.BEKLEMEDE
        2 -> KargoDurumu.YOLDA
        3 -> KargoDurumu.TESLIM_EDILDI
        else -> null
    }

    if (guncelDurum == null){
        println("HATA: Seçtiğiniz durum kodu geçersiz!")
    } else{
        when(guncelDurum){
            KargoDurumu.BEKLEMEDE -> println("Sipariş onaylandı.")
            KargoDurumu.YOLDA -> println("Kargonuz yola çıktı, en kısa sürede teslim edilecektir.")
            KargoDurumu.TESLIM_EDILDI -> println("Başarıyla kargo adresine teslim edilmiştir.")
        }
    }
}