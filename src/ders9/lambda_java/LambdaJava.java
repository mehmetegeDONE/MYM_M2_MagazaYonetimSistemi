package ders9.lambda_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaJava {
    public static void main(String[] args) {

       int[] sayilar = {1,2,3,4,5};

       int[] ciftler = Arrays.stream(sayilar)
                            .filter(sayi -> sayi % 2 == 0)
                            .toArray();

        System.out.println(Arrays.toString(ciftler));

       int[] kareler = Arrays.stream(sayilar)
               .map(sayi -> sayi * sayi)
               .toArray();

        System.out.println(Arrays.toString(kareler));

        Arrays.stream(sayilar)
                .forEach(sayi -> System.out.println(sayi));

        // ----------------------------------------------------------------------
        int[] numaralar = {10,15,45,85,5,20,25,30};
        Arrays.stream(numaralar)
                .filter(numara -> numara > 15)
                .map(numara -> numara * 2)
                .forEach(numara -> System.out.println(numara)); // 40,50,60

        System.out.println("--------------------------------");

        Arrays.stream(numaralar)
                .sorted()
                .forEach(sayi -> System.out.println(sayi));

        System.out.println("--------------------------------");


        System.out.println("--------------------------------");
        long adet = Arrays.stream(numaralar) // 5 tane 15'den büyük
                        .filter(numara -> numara > 15)
                        .count();

        System.out.println(adet);

    }
}
