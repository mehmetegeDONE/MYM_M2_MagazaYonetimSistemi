package ders8.Inheritance

open class Hayvan { // extense yapabilmek için open yapmalısın!
    var ad : String = ""
    var yas : Int = 0

    fun beslen() = println("$ad yemek yiyor...")

    fun uykumodu() = println("$ad uyuyor...")
}