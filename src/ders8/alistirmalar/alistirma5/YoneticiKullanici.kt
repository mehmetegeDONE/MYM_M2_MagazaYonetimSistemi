package ders8.alistirmalar.alistirma5

class YoneticiKullanici(ad: String, val yetkiGirdi: Int) : Kullanici(ad) {
    var yetkiSeviye = yetkiGirdi
        set(value) {
            if (value !in 1..5){
                println("Hatalı yetki, seviye 1 yapıldı")
                field = 1
            } else{
                field = value
            }
        }

    init {
        yetkiSeviye = yetkiGirdi
    }
}