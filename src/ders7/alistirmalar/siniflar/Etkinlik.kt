package ders7.alistirmalar.siniflar

class Etkinlik (val etkinlikAd: String, baslangicSaatiGirdisi: Int, bitisSaatiGirdisi: Int){

    var baslangicSaati = 0
    var bitisSaati = 0

    init {

        val baslangicSifirVeYirmiDortArasindaMi = baslangicSaatiGirdisi in 0..24
        val bitisSifirVeYirmiDortArasindaMi = bitisSaatiGirdisi in 0..24

        if (!baslangicSifirVeYirmiDortArasindaMi || !bitisSifirVeYirmiDortArasindaMi){
            println("Hatali Giris!... Lütfen Tekrar Girin!")

        } else{
            baslangicSaati = baslangicSaatiGirdisi
            bitisSaati = bitisSaatiGirdisi
        }

        if (bitisSaati < baslangicSaati){
            println("Hata: Bitiş saati başlangıçtan önce olamaz! Bitiş saati otomatik olarak başlangıcın 2 saat sonrasına ayarlandı: ${baslangicSaati + 2}")
            bitisSaati = baslangicSaati + 2
        }
    }
}