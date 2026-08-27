package ders9.alistirmalar.alistirma4

fun main() {
    /*
    Öğrenci adını ve aldığı puanı (Int) barındıran bir Ogrenci veri sınıfı (data class) tasarlayın.
    main içinde bu sınıftan türetilmiş 4 öğrencilik sabit bir liste oluşturun. Kullanıcıdan baraj geçme notunu (Int) konsoldan girmesini isteyin.
    Listenin içinden bu baraj notunun altında kalan başarısız öğrencileri süzün.
    Süzülen öğrencilerin sadece isimlerini çekip (dönüştürüp) ekrana “Dersten Kalan Öğrenci: [İsim]” şeklinde alt alta listeleyin.
    */

    val ogrenciler = listOf<Ogrenci>(
        Ogrenci("Mehmet Sarı", 85),
        Ogrenci("Ömer Kacar",45),
        Ogrenci("Kayra Yılmaz",30),
        Ogrenci("Nuray Birinci",90)
    )


    print("Dersten geçme notu nedir?: ")
    val gecmeNotu = readln().toIntOrNull()?: 50

    val kalanlar = ogrenciler
        .filter { it.puan < gecmeNotu }
        .map { it.ad }

    if (kalanlar.isEmpty()){
        println("Tebrikler derste kalan öğrenci bulunmamaktadır!")
    } else{
        println("Kalanlar: ")
        val kalanOgrenciSay = kalanlar.count()
        kalanlar.forEach { println("Dersten kalan öğrenci: $it") }
        println(kalanOgrenciSay)
    }

}