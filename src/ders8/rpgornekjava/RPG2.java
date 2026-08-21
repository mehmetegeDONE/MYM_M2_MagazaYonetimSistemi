package ders8.rpgornekjava;

public class RPG2 {
    public static void main(String[] args)
    {

        Buyucu buyucu = new Buyucu("Mert");
        Paladin paladin = new Paladin("Mustafa");
        Suikasci suikasci = new Suikasci("Muhammet");

        System.out.println(buyucu.saglik);
        System.out.println(paladin.saglik);
        System.out.println(suikasci.saglik);

        buyucu.buyuYap();
        buyucu.hasarAl();
        paladin.buyuYap();
        paladin.kalkanKullan();
        paladin.hasarAl();
        suikasci.gizlen();
        suikasci.hasarAl();

    }
}

