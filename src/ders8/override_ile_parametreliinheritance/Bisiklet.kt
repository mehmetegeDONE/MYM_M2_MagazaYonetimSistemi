package ders8.override_ile_parametreliinheritance

class Bisiklet(
    marka: String, tekerlekSayisi: Int) : Arac(marka, tekerlekSayi = 2){

    // bisiklet ise varsayilan değeri 2
    override fun kornaCal() {
        println("Zırrrr.")
    }
}