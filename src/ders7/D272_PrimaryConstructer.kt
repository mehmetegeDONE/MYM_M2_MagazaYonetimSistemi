package ders7

import ders7.siniflar.Araba
import ders7.siniflar.Araba2


fun main(){
    val araba1 = Araba("Tofaş", uretimYili = 2008, renk = "Kırmızı")
    val araba2 = Araba2("Togg", uretimYili = 2015, renk = "Mavi")
    araba2.hiz = 100
    araba2.motorCalisiyor = true

    araba2.hiz = 50
    araba2.motorCalisiyor = true

    println(araba1.marka)
    println(araba1.renk)
    println(araba1.uretimYili)
    println("-------------------------------------------------------")
    println(araba2.marka)
    println(araba2.renk)
    println(araba2.uretimYili)
    println(araba2.hiz)
    println(araba2.motorCalisiyor)


}