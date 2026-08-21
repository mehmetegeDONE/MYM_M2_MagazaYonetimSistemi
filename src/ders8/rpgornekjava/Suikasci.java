package ders8.rpgornekjava;

public class Suikasci extends Oyuncu{

    public Suikasci(String isim, int saglik) {
        super(isim, saglik);
    }

    public Suikasci(String isim) {
        super(isim);
        this.saglik = 20;
    }

    void gizlen(){
        System.out.println("Suikasçı gizlendi");
    }
}
