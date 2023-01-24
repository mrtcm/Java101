package Donguler;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi1,sayi2,ebob=0,ekok,sayac=1;
        System.out.print("birinci sayıyı giriniz : ");
        sayi1 = inp.nextInt();
        System.out.print("ikinci sayıyı giriniz : ");
        sayi2 = inp.nextInt();
        while (sayac<=sayi1 || sayac<=sayi2){
            if (sayi1%sayac==0 && sayi2%sayac==0){
                if (sayac>ebob){
                    ebob=sayac;
                }
            }
            sayac++;
        }
        ekok = (sayi1*sayi2)/ebob;
        System.out.println("ebob = "+ebob+"\nekok = "+ekok);

    }
}
