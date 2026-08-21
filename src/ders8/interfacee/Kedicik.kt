package ders8.interfacee

import ders8.Inheritance.Hayvan

class Kedicik : Hayvan(), SesCikarabilir{ // Hem miras alır hem de interface kullanabilirsin
    override fun sesCikar() {
        println("MİYAVV")
    }
}