package ders6.alistirmalar.siniflar

class BankaHesabi {
    private var bakiye : Double = 0.0

    fun bakiyeSorgula(): Double{
        return bakiye
    }

    fun paraYatir(miktar: Double){
        if (miktar > 0){
            bakiye += miktar
            println("Başarılı: $miktar TL yatırıldı.")
        } else{
            println("Yatırılacak tutar 0'dan büyük olmalıdır!")
        }
    }

    fun paraCek(miktar: Double){
        if (miktar <= 0){
            println("HATA: Çekilecek tutar 0'dan büyük olmalıdır!")
        } else if (miktar > bakiye){
            println("Yetersiz bakiye, bakiyeniz: $bakiye")
        } else{
            bakiye -= miktar
            println("İşlem başarılı $miktar TL çekildi.")
        }
    }
}