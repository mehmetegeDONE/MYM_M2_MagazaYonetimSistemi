package ders7.alistirmalar.siniflar

class Kitap (
    val ad : String,
    val yazar : String,
    sayfaSayisiGirdisi : Int
) {

    var sayfaSayisi = sayfaSayisiGirdisi
        set(value) {
            if (value < 1){
                println("Hatalı sayfa sayısı! Sayfa sayısı 1 olarak ayarlandı.")
                field = 1
            }
        }

    init {
        sayfaSayisi = sayfaSayisiGirdisi
    }
}