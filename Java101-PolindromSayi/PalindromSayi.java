package metotlar;

import java.util.Scanner;

public class PalindromSayi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("sayı giriniz : ");

        int sayi = scn.nextInt();
        if (Pdsayi(sayi)==sayi){
            System.out.println("bu bir palindrom sayıdır ");
        }
        else {
            System.out.println("Bu bir palindrom sayı değildir");
        }
    }
    static int BasamakBulma(int sayi ){
        int sayac = 0;
        while (sayi>0){
            sayi=sayi/10;
            sayac++;
        }
        return sayac;
    }
    static int Pdsayi(int sayi){
        int sonuc =0 ,  ysayi=0;
        int sayac = BasamakBulma(sayi);
        for (int i = 1;i<=sayac;i++){
            ysayi=sayi%10;
            sayi/=10;
            for (int j = BasamakBulma(sayi) ; j >=1;j--){
                ysayi*=10;
            }
            sonuc+=ysayi;
        }
        System.out.println("tersi = " + sonuc);
        return sonuc;
    }
}
