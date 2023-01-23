package Donguler;

import java.util.Scanner;

public class KombinasyonHesap {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n ,r,kombinasyon;
        System.out.print("C(n,r) n = ");
        n = inp.nextInt();
        System.out.print("C(n,r) r = ");
        r = inp.nextInt();
        kombinasyon = faktoriyelhesapla(n) /(faktoriyelhesapla(r)*faktoriyelhesapla((n-r)));
        System.out.println("verdiğiniz degerlerin kombinasyon sonucu : "+kombinasyon);
    }
    public static int  faktoriyelhesapla(int sayi){
        int fak = 1,sonuc = 0;
        for (int i = sayi;i>=1;i--){
            fak = fak*i;
            sonuc+=fak;
        }
        return fak;
    }
}

