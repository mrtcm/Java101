package kontrolyapisi;

import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        int sayi1,sayi2,sayi3,eb= 0,ek = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("1.sayıyı giriniz : ");
        sayi1 = input.nextInt();
        System.out.print("2.sayıyı giriniz : ");
        sayi2 = input.nextInt();
        System.out.print("3.sayıyı giriniz : ");
        sayi3 = input.nextInt();
        if (sayi1 > sayi2 && sayi1 > sayi3){
            eb = sayi1;
            if (sayi2>sayi3){
                ek = sayi3;
            } else if (sayi3>sayi2) {
                ek  = sayi2;
            }
        } else if (sayi2>sayi1 && sayi2> sayi3) {
            eb = sayi2;
            if (sayi1>sayi3){
                ek = sayi3;
            } else if (sayi3>sayi1) {
                ek = sayi1;
            }
        } else if (sayi3> sayi1 && sayi3>sayi2) {
            eb = sayi3;
            if (sayi2>sayi1){
                ek = sayi1;
            } else if (sayi2<sayi1) {
                ek = sayi2;
            }

        }
        System.out.println("en büyük sayı  = "+ eb + "\nenküçük sayı = "+ ek);
    }
}
