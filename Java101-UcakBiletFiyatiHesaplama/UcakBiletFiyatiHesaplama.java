package kontrolyapisi;

import java.util.Scanner;

public class UcakBiletFiyatiHesaplama {
    public static void main(String[] args) {
        int mesafe,yas,yolculuktipi;
        double mesafebasiucret = 0.10,toplamfiyat,idirimlitutar;
        Scanner inp = new Scanner(System.in);
        System.out.print("gidilecek mesafe (km) : ");
        mesafe = inp.nextInt();
        System.out.print("yaşınızı giriniz : ");
        yas  = inp.nextInt();
        System.out.print("yolculuk tipiniz tek yön ise =>1 , çift yön ise =>2 yazınız   : ");
        yolculuktipi = inp.nextInt();
        if (yas >=1 && (yolculuktipi==1 || yolculuktipi == 2 )&& mesafe>=1  ){
            toplamfiyat = mesafe*mesafebasiucret;

                if (yas < 12 ){
                    toplamfiyat =toplamfiyat-(toplamfiyat*0.5);
                }
                else if (yas>=12 && yas<=24){
                    toplamfiyat=toplamfiyat-(toplamfiyat*0.1);
                } else if (yas>65) {
                    toplamfiyat=toplamfiyat-(toplamfiyat*0.3);
                }
                if (yolculuktipi == 2) {
                    toplamfiyat= toplamfiyat-(toplamfiyat*0.2);
                }

            System.out.println("toplam maliyetiniz : "+toplamfiyat+" TL");
        }
        else {
            System.out.println("hatalı veri girdiniz !");
        }

    }
}
