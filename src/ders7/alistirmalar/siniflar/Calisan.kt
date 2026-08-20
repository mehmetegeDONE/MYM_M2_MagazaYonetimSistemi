package ders7.alistirmalar.siniflar

class Calisan (val isim: String){
    companion object{
        var toplamCalisanSayisi = 0
    }

    init {
        toplamCalisanSayisi++
    }
}