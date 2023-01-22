package kontrolyapisi;

import java.util.Scanner;

public class NotOrtKontrolIfElse {
    public static void main(String[] args) {
        int turkce,mat,fizik,muzik,kimya;
        double ort ;
        Scanner input = new Scanner(System.in);
        System.out.print("matematik notu  : ");
        mat = input.nextInt();
        System.out.print("türkçe notu : ");
        turkce = input.nextInt();
        System.out.print("fizik notunuz : ");
        fizik = input.nextInt();
        System.out.print("müzik notunuz : ");
        muzik = input.nextInt();
        System.out.print("kimya notu : ");
        kimya = input.nextInt();
        if ((mat>=0 && mat<=100)&&(turkce>=0 && turkce<=100)&&(fizik>=0 && fizik<=100)&&(muzik>=0 && muzik<=100)&&(kimya>=0 && kimya<=100)){
            ort = (mat+turkce+kimya+fizik+muzik)/5;
            if (ort >= 55 ){
                System.out.println("tebrikler geçtiniz notunuz : "+ort);
            }
            else {
                System.out.println("malesef kaldınız notunuz : "+ort);

            }

        }
        else {
            System.out.println("hatalı not girdiniz lütfen tekrar deneyiniz (notlar 0 ve 100 arasında olamlı) ! ");
        }

    }
}
