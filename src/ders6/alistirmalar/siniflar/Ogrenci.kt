package ders6.alistirmalar.siniflar

class Ogrenci {
    /*
     adSoyad (String, varsayılan değeri “Bilinmeyen”) ve notlar (Int değerler tutabilen, başlangıçta boş ve dinamik bir Liste) özelliklerini tanımlayın.
     */

    val adSoyad = "Bilinmeyen"
    val notlar = mutableListOf<Int>()

    fun notEkle(yeniNot: Int){
        if (yeniNot in 0..100){
            println("Sistem: Not başarıyla eklendi.")
            notlar.add(yeniNot)
        } else{
            println("Hata: Not 0 ile 100 arasında olmalıdır!")
        }
    }

    fun ortalamaHesapla(): Double{
        if (notlar.isEmpty()) return 0.0
        var toplam = 0.0

        for (not in notlar){
            toplam += not
        }

        return toplam / notlar.size
    }
}