package Donguler;

import java.util.Scanner;

public class AtmProgrami {
    public static void main(String[] args) {
        Scanner inp  = new Scanner(System.in);
        boolean kontrol=true;
        int girishak=3,bakiye=0;
        while (girishak>0 && kontrol) {
            String kadi, ksifre;
            System.out.print("kullanıcı adınız :");
            kadi = inp.nextLine();
            System.out.print("şifreniz : ");
            ksifre = inp.nextLine();
            if (kadi.equals("mertcem") && ksifre.equals("123")) {
                System.out.println("giriş başarılı ");
                bakiye=1500;
                while (kontrol) {
                System.out.println("1->para çekme\n2->para yatırma\n3->bakiye sorgula\n4->çıkış yap ");
                System.out.print("yapmak istediğiniz işlemi giriniz örn:(1,2,3,4):");
                int giris = inp.nextInt();

                    switch (giris) {
                        case 1:
                            System.out.print("çekmek istediğiniz miktarı giriniz :");
                            int miktar = inp.nextInt();
                            if (miktar>bakiye){
                                System.out.println("bakiye yetersiz mevcut bakiyeniz :"+bakiye);
                            }
                            else {
                                bakiye-=miktar;
                                System.out.println("para çekme başarılı mevcut akiyeniz : "+bakiye);
                            }
                            break;
                        case 2:
                            System.out.print("yatırmak istediğiniz miktarı giriniz :");
                            miktar = inp.nextInt();
                            bakiye+=miktar;
                            System.out.println("para yatırma başarılı mevcut akiyeniz : "+bakiye);
                            break;
                        case 3:
                            System.out.print("mevcut bakiyeniz : "+bakiye);
                            break;
                        case 4:
                            System.out.println("çıkış yapılıyor...");
                            kontrol=false;
                            break;
                    }
                }
            } else {
                System.out.println("hatalı veri tekrar deneyiniz .");
                System.out.println("kalan giriş hakkı: "+--girishak);
                }
            }
        }
    }