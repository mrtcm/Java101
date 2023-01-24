package Donguler;

import java.util.Scanner;

public class UsluSayiHesap {
    public static void main(String[] args) {
        int a,b,sonuc=1;
        Scanner inp = new Scanner(System.in);
        System.out.print("taban giriniz : ");
        a = inp.nextInt();
        System.out.print("üs giriniz : ");
        b = inp.nextInt();
        for (int i = 1 ; i < b ; i++ ){
            sonuc *=a;
        }
        System.out.println("sonuç = " +sonuc);

    }
}
