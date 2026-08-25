package ders9.enumlar_java;

public class EnumClassJava {
    public static void main(String[] args) {

        TrafikIsigi isik = TrafikIsigi.KIRMIZI;

        switch (isik){
            case KIRMIZI:
                System.out.println("Dur");
                break;
            case SARI:
                System.out.println("Bekle");
                break;
            case YESIL:
                System.out.println("Git");
                break;
        }
    }
}
