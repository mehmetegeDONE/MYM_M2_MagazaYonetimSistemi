package ders9.dataclass

fun main() {
    val urun1 = UrunModeli(1,"Klavye")
    val urun2 = UrunModeli(1,"Klavye")

    // Data Classlar Değerlere Bakar... (Adrese değil)
    println(urun1)
    println(urun2)
    println(urun1 == urun2)

    val urun1v2 = urun1.copy(sepetteMi = true) // urun1'in değerleri kopyalar (Sdc Data Classta)
    println(urun1v2)

    println(urun1.equals(urun2)) //urun1 ile urun2 değerleri aynı mı kontrol eder... (data class harici de yapılabilir generate equals() ile)
}