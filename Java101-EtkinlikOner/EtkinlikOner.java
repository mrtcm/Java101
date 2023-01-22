package kontrolyapisi;

import java.util.Scanner;

public class EtkinlikOner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sıcaklık değerini giriniz : ");
        int sicaklik = input.nextInt();
        if (sicaklik<5){
            System.out.println("kayak yapmaya gidebilirisin.");
        }
        else if (sicaklik <=15){
            System.out.println("sinemaya gidebilirsin");
            if (sicaklik>=10 && sicaklik<=15) {
                System.out.println("pikniğe gidebilirsin");
            }
        }
        else if (sicaklik>15 && sicaklik<=25) {
            System.out.println("pikniğe gidebilirsin");
        }
        else {
            System.out.println("yüzmeye gidebilirsin");
        }


    }
}
