import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matematik,turkce,muzik,fizik,kimya,tarih;
        double ortalama = 0 ;
        System.out.print("matematik notunuz : ");
        matematik= input.nextInt();
        System.out.print("türkçe notunuz : ");
        turkce= input.nextInt();
        System.out.print("müzik notunuz : ");
        muzik = input.nextInt();
        System.out.print("fizik notunuz : ");
        fizik = input.nextInt();
        System.out.print("kimya notunuz : ");
        kimya= input.nextInt();
        System.out.print("tarih  notunuz : ");
        tarih= input.nextInt();
        ortalama = (matematik+turkce+fizik+muzik+tarih+kimya)/6;
        String sonuc = ortalama>60 ? "sınıfı geçti" : "sınıfta kaldı";
        System.out.println("dönem durumunuz : "+ortalama+"=>"+sonuc);


    }
}
