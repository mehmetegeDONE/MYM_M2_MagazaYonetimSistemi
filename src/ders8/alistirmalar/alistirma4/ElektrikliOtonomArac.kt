package ders8.alistirmalar.alistirma4

class ElektrikliOtonomArac : Surulebilir, SarjEdilebilir {

    override fun ilerle() {
        println()
        println(" > İlerleniyor...")
        println()
    }

    override fun sarjEt() {
        println()
        println(" > Şarj ediliyor...")
        println()
    }
}