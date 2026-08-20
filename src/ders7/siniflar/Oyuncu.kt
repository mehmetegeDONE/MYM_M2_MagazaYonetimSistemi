package ders7.siniflar

class Oyuncu (var isim: String, can: Int){

    var can: Int = can // Hem constructerda hem set kullanmak için yapmalısın
        set(value) { // cana atanacak deger
            if (value !in 0.. 100){
                println("HATA: Can değeri 0-100 arasında olmalıdır!")
                field = 100 // canın değeri
            } else{
                field = value
            }
        }


    init { // Constructer içinde kod yazabilmek için gereklidir...
        println("Oyuna yeni bir oyuncu katıldı! Hoşgeldin $isim!")

        if (can !in 0..100){
            println("Can değeri 0 ile 100 arasında olalıdır!")
            this.can = 100
        }
    }
}