package kontrolyapisi;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String kadi , ksifre ,kontrol,yksifre,ykadi ;
        Scanner input = new Scanner(System.in);
        System.out.print("lütfen kayıt olmak için  kullanıcı adınızı giriniz : ");
        kadi = input.nextLine();
        System.out.print("lütfen kayıt olmak için şifrenizi giriniz : ");
        ksifre = input.nextLine();
        if (kadi != "" && ksifre!=""){
            System.out.print("lütfen kullanıcı adınızı giriniz : ");
            ykadi = input.nextLine();
            System.out.print("lütfen şifrenizi giriniz : ");
            yksifre = input.nextLine();
            if (kadi.equals(ykadi) && ksifre.equals(yksifre)){
                System.out.println("gişiniz başarılı ");
            }
            else {
                System.out.print("hatalı giriş şifrenizi degiştirmek istermisiniz (Y/N): ");
                kontrol = input.nextLine();
                if (kontrol.equals("Y") || kontrol.equals("y")){
                    System.out.print("yeni kullanıcı adınız : ");
                   String yykadi = input.nextLine();
                    System.out.print("yeni şifreniz : ");
                    String yyksifre = input.nextLine();
                    if (ksifre.equals(yyksifre)&&kadi.equals(yykadi)){
                        System.out.println("yeni verileriniz eski verilerinizle aynı !");
                    }
                    else {
                        System.out.println("şifreniz başarılı bir şekilde degiştirildi.\n yeni şifreniz : " + ksifre+"\nyeni kullanıcı adınız : "+kadi);
                    }
                }
                else {
                    System.out.println("çıkış yapılıyor.");
                }
            }
        }
        else {
            System.out.println("hatalı veri girişi !");
        }
    }
}
