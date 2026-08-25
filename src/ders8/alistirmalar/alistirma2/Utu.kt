package ders8.alistirmalar.alistirma2

class Utu(marka: String) : EvAleti(marka) {

    override fun calis() {
        println("Ütü ısınmaya başladı, buhar hazır!")
    }
}