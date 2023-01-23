package Donguler;

import java.util.Scanner;

public class TamBolunme {
    public static void main(String[] args) {
        int sayi,toplam=0,sayac=-1;
        double ort=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        sayi = inp.nextInt();
        for (int i = 0 ; i<=sayi;i++){
            if (i%3==0 && i%4==0){
                toplam=toplam+i;
                sayac++;
            }
        }
        ort = toplam/sayac;
        System.out.println("ortlama : " +ort );
    }
}
