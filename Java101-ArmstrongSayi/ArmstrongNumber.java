package Donguler;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        do {
            int sayi, sayac = 0, deger = 0, toplam = 0;
            Scanner inp = new Scanner(System.in);
            System.out.print("sayı girin : ");
            sayi = inp.nextInt();
            int ksayi = sayi;
            int ysayi = sayi;
            while (sayi != 0) {
                sayi = sayi / 10;
                sayac++;
            }
            for (int i = 1; i <= sayac; i++) {
                deger = ksayi % 10;//basamak degerini verir
                ksayi = ksayi / 10;
                toplam += UsluSayi(deger, sayac);
            }
            if (ysayi == toplam) {
                System.out.println(ysayi + " sayısı bir armstrong sayıdır.");
            } else if (ysayi != toplam) {
                System.out.println(ysayi + " sayısı bir armstrong sayı değildir.");
            } else {
                System.out.println("hatalı veri girdiniz ");
            }
        }while (true);
    }
    public static int UsluSayi(int taban,int us){
        int sonuc=1;
        for (int i = 1 ; i<=us;i++){
            sonuc *=taban;
        }
        return sonuc;
    }
}
