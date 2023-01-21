import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00,toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.print("armut kilogramı : ");
        int ark = input.nextInt();
        toplam = toplam + (armut*ark);
        System.out.print("elma kilogramı : ");
        int elk = input.nextInt();
        toplam = toplam + (elma*elk);
        System.out.print("domates  kilogramı : ");
        int dok = input.nextInt();
        toplam = toplam + (domates*dok);
        System.out.print("muz  kilogramı : ");
        int muk = input.nextInt();
        toplam = toplam + (muz *muk);
        System.out.print("patlican kilogramı : ");
        int pak = input.nextInt();
        toplam = toplam + (patlican*pak);
        System.out.print("toplam ödenecek tutar : " + toplam);



    }
}
