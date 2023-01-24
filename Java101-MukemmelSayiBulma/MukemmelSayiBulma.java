package Donguler;

import java.util.Scanner;

public class MukemmelSayiBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi,toplam=0 ;
        while (true) {
            System.out.print("bir sayı giriniz : ");
            sayi = inp.nextInt();
            for (int i = 1 ; i<sayi;i++){
                if (sayi%i==0){
                    toplam+=i;
                }
            }
            if (sayi==toplam){
                System.out.println(sayi+" bir mükemmel sayıdır.");
            }
            else {
                System.out.println(sayi+" bir mükemmel sayı değil.");
            }
        }

    }
}
