import java.util.Arrays;
import java.util.Scanner;

public class DiziElemanSirala {
    //[12,112,212,21,1]
static void sirala(int[] dizi ){
    int temp =0 ;
    for (int i = 0 ; i < dizi.length;i++){
        for (int j =  0 ; j< dizi.length;j++){
            if (i!=j && dizi[i]<dizi[j]){
                temp = dizi[i];
                dizi[i] = dizi[j];
                dizi[j] = temp;
            }
        }
    }
    for (int i : dizi){
        System.out.print(i + " ");
    }
}


    public static void main(String[] args) {
        int eklesayi = 0;
        Scanner scn = new Scanner(System.in);
        System.out.print("lütfen dizi uzunlugunu giriniz : ");
        int sayi = scn.nextInt();
        int[] dizi = new int[sayi];
        for (int i = 0 ; i < dizi.length;i++ ){
            System.out.print("sayı "+(i+1) + " : " );
            eklesayi = scn.nextInt();
            dizi[i] = eklesayi;
        }
        sirala(dizi);

    }
}
