package Donguler;


import java.util.Scanner;


public class BasamakSayiToplam {


    public static void main(String[] args) {
        int sayi , sayac= 0,toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.print("sayı gir :");
        sayi = input.nextInt();
        while (sayi!=0){
            toplam= toplam+(sayi%10);
            sayi  = sayi/10;
            sayac++;
        }
        System.out.println("basamaklarındaki sayılar toplamı : "+toplam);


    }

}
