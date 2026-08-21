package ders8.rpgornekjava;

public class Oyuncu {

    String isim;
    int saglik = 100;

    public Oyuncu(String isim, int saglik) {
        this.isim = isim.trim().toUpperCase().charAt(0) + isim.trim().substring(1);
        this.saglik = saglik;
    }

    public Oyuncu(String isim) {
        this.isim = isim.trim().toUpperCase().charAt(0) + isim.trim().substring(1);
    }

    public void hasarAl(){
        System.out.println(isim + " hasar aldı!");
    }
}
