package ders7.siniflar

class Matematik {
    companion object{ // Buradaki değerler statictir
        const val pi = 3.14 // const javadaki final (KESSİNLİKLE Değiştirilemez değer)

        fun daireCevresi(yaricap : Double) = 2 * pi * yaricap
    }
}