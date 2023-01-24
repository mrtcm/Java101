package Donguler;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int basamak;
        System.out.println("basamak sayısı giriniz : ");
        basamak=inp.nextInt();
        for (int i = basamak ; i>=1;i--){
            for (int j = basamak-i ; j>=1;j--){
                System.out.print(" ");
            }
            for (int k = (2*i)-1;k>=1;k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
