package ders8.override_ile_parametreliinheritance

open class Arac (
    val marka: String,
    var tekerlekSayi : Int = 4
    ) {

    // override yapmak için fun'u open yapmalısın
   open fun kornaCal(){
       println("Biip")
    }

}