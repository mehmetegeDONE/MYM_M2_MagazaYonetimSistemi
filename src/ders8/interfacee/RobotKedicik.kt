package ders8.interfacee

class RobotKedicik : SesCikarabilir, SarjEdilebilir { // Birden fazla interface kullanabilirsin

    override fun sesCikar() {
        println("Bip bip bip meow")
    }

    override fun sarjEt() {
        println("Şarj oluyor...")
    }

}