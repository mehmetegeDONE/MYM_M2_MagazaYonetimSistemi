package ders7.alistirmalar.siniflar

class FizikMotoru {
    companion object{
        const val YER_CEKIMI = 9.8

        fun serbestDususSaniyesi(sure : Double) = (sure * YER_CEKIMI)
    }
}