package ders9.lambda

fun main() {
    val sayilar = listOf(1,2,3,4,5)

    val ciftler = sayilar.filter { it % 2 == 0}
    println(ciftler)

    val kareler = sayilar.map { it * it }
    println(kareler)

    ciftler.forEach { println(it) }

    val numaralar = listOf(10,15,45,85,5,20,25,30)

    numaralar
        .filter { it > 15 }
        .map { it * 2 }
        .forEach {println(it)} // 40,50,60

    println("--------------------------------")
    numaralar
        .sorted()
        .forEach { println(it) }
    println("--------------------------------")
    numaralar
        .sorted()
        .reversed()
        .forEach { println(it) }
    println("--------------------------------")
    val adet = numaralar // 5 tane 15'den büyük
                .count(){it > 15}
}
