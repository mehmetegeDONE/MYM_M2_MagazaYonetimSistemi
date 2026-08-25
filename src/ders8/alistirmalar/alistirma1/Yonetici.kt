package ders8.alistirmalar.alistirma1

class Yonetici(isim: String, maas: Double, var prim: Double) : Calisan(isim, maas) {

    override fun maasHesapla(): Double {
        return maas + prim
    }
}