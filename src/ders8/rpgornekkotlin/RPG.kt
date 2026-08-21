package ders8.rpgornekkotlin

fun main() {
    var buyucu = Buyucu("mert")
    var savasci = Savaci("kaan",25)
    var paladin = Paladin("ayşe")
    var suikasci = Suikasci("selim",100)

    buyucu.hasarAl()
    buyucu.buyuYap()
    savasci.kalkanKullan()
    paladin.kalkanKullan()
    paladin.buyuYap()
    suikasci.gizlen()
}