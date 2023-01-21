import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy,kilo,bki;
        System.out.print("boyunuzu giriniz(m) : ");
        boy=input.nextDouble();
        System.out.print("kilonuzu giriniz(kg) : ");
        kilo = input.nextDouble();
        bki = kilo /( boy*boy );
        System.out.println("beden kitle indeksi : " + bki);
    }
}
