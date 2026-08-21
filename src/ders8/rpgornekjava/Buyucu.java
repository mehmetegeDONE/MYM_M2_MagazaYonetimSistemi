package ders8.rpgornekjava;

public class Buyucu extends Oyuncu implements BuyuYapabilir {

    public Buyucu(String isim, int saglik) {
        super(isim, saglik);
    }

    public Buyucu(String isim) {
        super(isim);
        this.saglik = 20;
    }

    @Override
    public void buyuYap() {
        System.out.println("Büyücü büyü yapıyor...");
    }
}
