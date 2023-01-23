package Donguler;

import java.util.Scanner;

public class TekSayiKontrol {
    public static void main(String[] args) {
        int sayi,toplam = 0;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.print("bir sayı giriniz :");
            sayi = inp.nextInt();
            if (sayi%2==0 && sayi%4==0){
                toplam+=sayi;
            }
        }while(sayi%2==0);
        System.out.println("toplam : "+toplam);
    }
}
