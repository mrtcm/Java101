import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("fiyat  giriniz : ");
        double fiyat = input.nextDouble();
        double kdv = fiyat>= 0 && fiyat <=1000 ?  0.18 : 0.08;
        double kdvmiktari = fiyat * 0.18;
        double kdvlifiyat = fiyat+kdvmiktari;
        System.out.println("kdv miktarı : "+kdvmiktari);
        System.out.println("kdvli fiyat : "+ kdvlifiyat);
        System.out.println("kdv : "+kdv);



    }
}
