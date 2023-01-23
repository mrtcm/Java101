package Donguler;

import java.util.Scanner;

public class DortVeBesKuvvetleri {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi;
        System.out.print("lütfen bir sayı giriniz : ");
        sayi = inp.nextInt();
        System.out.print("4'ün kuvvetleri: ");
        for (int i = 1; i <= sayi; i *= 4) {
            System.out.print(i + ",");
        }
        System.out.print("\n5'in kuvvetleri : ");
        for (int j = 1 ; j<=sayi;j*=5){
            System.out.print(j+",");
        }
    }
}
