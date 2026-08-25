package ders9.dataclass

data class UrunModeli(val id: Int,val isim: String, val sepetteMi : Boolean = false)
// Sıradan bir sınıf ile iki farklı araba nesnesi üretip özelliklerini birebir aynı girsek bile,
// Kotlin bunlara araba1 == araba2 diye sorduğumuzda false yanıtını verir.
// Çünkü bunlar bellekte farklı yerlerde duran farklı objelerdir.
// Ancak Data Class bellek adresine değil, içindeki verilere bakar. Özellikleri aynıysa onlara true der!