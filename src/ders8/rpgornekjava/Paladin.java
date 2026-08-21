package ders8.rpgornekjava;

public class Paladin extends Oyuncu implements BuyuYapabilir, KalkanKullanabilir{

    public Paladin(String isim, int saglik) {
        super(isim, saglik);
    }

    public Paladin(String isim) {
        super(isim);
        this.saglik = 70;
    }

    @Override
    public void buyuYap() {
        System.out.println("Paladin büyü yapıyor!");
    }

    @Override
    public void kalkanKullan() {
        System.out.println("Paladin kalkan kullanıyor!");
    }
}
