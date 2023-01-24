package Donguler;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi,min=2147483647,max=-2147483648;
        System.out.print("kaç sayı girmek istiyorsunuz : ");
        sayi = inp.nextInt();
        for (int i =1 ; i<=sayi;i++){
           System.out.print(i+".sayı : ");
           int gsayi = inp.nextInt();
           if (gsayi>max){
               max=gsayi;
           }
           if (gsayi<min) {
               min=gsayi;
           }
        }
        System.out.println("en küçük sayı = "+min+"\nen büyük sayı = "+max);


    }
}
