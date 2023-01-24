package Donguler;

import java.util.Scanner;

public class HarmonikSeriBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi;
        double sonuc = 0;
        System.out.print("bir sayı giriniz : ");
        sayi = inp.nextInt();
        for (double i = 1 ; i<=sayi;i++){
            sonuc += 1/i;
        }
        System.out.println("sonuc : "+sonuc);
    }
}
