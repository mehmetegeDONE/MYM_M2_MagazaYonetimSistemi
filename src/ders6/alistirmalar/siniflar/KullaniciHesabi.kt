package ders6.alistirmalar.siniflar

class KullaniciHesabi {

    var sifre : String = "123456"
        set(value) {
            if (value.length >= 6){
                field = value
                println("Şifre başarıyla güncellendi")
            } else
                println("Şirfe 6'ya eşit veya büyük olmalıdır!")
        }
}