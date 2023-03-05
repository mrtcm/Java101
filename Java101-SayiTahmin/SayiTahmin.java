package MathSinifi;

import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner inp = new Scanner(System.in);
        boolean kontrol = true;
        int hak = 5;

        while (kontrol){

            if (hak == 0 ) {

                kontrol = false;
                System.out.println("hakkınız kalmadı :(");
                break;
            }
            System.out.print("tahmin giriniz(0 ve 100 arasında) : ");
            int sayi = inp.nextInt();

                if ((sayi >= 0 && sayi <= 100)) {
                    if (sayi == rnd.nextInt(101)) {
                        System.out.println("tebrikler sayıyı dogru tahmin ettiniz. kalan hakkınız : " + hak);
                    } else {
                        hak--;
                        System.out.println("yanlış cevap ! kalan hakkınız : " + hak);

                    }
                }
                else {
                    System.out.println("girdiğiniz sayı 0 ile 100 arasında olmalı");
                }


        }
    }
}
