package ders8.override_ile_parametreliinheritance

fun main() {
    val bisiklet = Bisiklet("BMX",3)
    bisiklet.kornaCal()
    println(bisiklet.marka)

    bisiklet.tekerlekSayi = 3
    println(bisiklet.tekerlekSayi)
}