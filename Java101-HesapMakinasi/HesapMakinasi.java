package kontrolyapisi;

import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1,sayi2,sonuc;
        System.out.print("sayı1 : ");
        sayi1 = input.nextInt();
        System.out.print("sayı2 : ");
        sayi2 = input.nextInt();


        System.out.print("yapılacak işlemi girin : ");
        String islem = input.next();
        switch (islem){
            case "+":
               sonuc =  sayi1+sayi2;
                System.out.print(sayi1+"+"+sayi2+"="+sonuc);
                break;
            case "-":
                sonuc =  sayi1-sayi2;
                System.out.print(sayi1+"-"+sayi2+"="+sonuc);
                break;
            case "*":
                sonuc =  sayi1*sayi2;
                System.out.print(sayi1+"*"+sayi2+"="+sonuc);
                break;
            case "/":
                sonuc =  sayi1/sayi2;
                System.out.print(sayi1+"/"+sayi2+"="+sonuc);
                break;
            default:
                System.out.println("hatalı giriş yaptınız !");
        }
    }
}
