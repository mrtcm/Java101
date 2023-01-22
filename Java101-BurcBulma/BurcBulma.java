package kontrolyapisi;

import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] aylar = {"ocak","şubat","mart","nisan","mayıs","haziran","temmuz","ağustos","eylül","ekim","kasım","aralık"};
        String[] burclar = {"koç","boğa","ikizler","yengeç","aslan","başak","terazi","akrep","yay","oğlak","kova","balık"};
        String ay;
        int gun ;
        System.out.println("doğduğunuz ayı giriniz : ");
        ay = input.nextLine();
        System.out.println("doğduğunuz gün giriniz : ");
        gun = input.nextInt();
        if (ay.equals(aylar[2])){
            if (gun >= 21 && gun<=29 ){
                System.out.println("burcun : " + burclar[0]);
            }
            else if (gun<20 && gun >= 1 ){
                System.out.println("burcun" + burclar[11]);
            }
        } else if (ay.equals(aylar[3])) {
            if (gun >= 1 && gun <= 20) {
                System.out.println("burcun : " + burclar[0]);
            } else if (gun > 21 && gun <= 30) {
                System.out.println("burcun" + burclar[1]);
            }
        }
        else if (ay.equals(aylar[0])) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("burcun : " + burclar[9]);
            } else if (gun > 21 ) {
                System.out.println("burcun : " + burclar[10]);
            }
        }
        else if (ay.equals(aylar[1])) {
            if (gun >= 1 && gun <= 19) {
                System.out.println("burcun : " + burclar[10]);
            } else if (gun >= 20 ) {
                System.out.println("burcun : " + burclar[11]);
            }
        }
        else if (ay.equals(aylar[4])) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("burcun : " + burclar[1]);
            } else if (gun >= 22 ) {
                System.out.println("burcun : " + burclar[2]);
            }
        }
        else if (ay.equals(aylar[5])) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("burcun : " + burclar[2]);
            } else if (gun >= 23 ) {
                System.out.println("burcun : " + burclar[3]);
            }
        }
        else if (ay.equals(aylar[6])) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("burcun : " + burclar[3]);
            } else if (gun >= 23 ) {
                System.out.println("burcun : " + burclar[4]);
            }
        }
        else if (ay.equals(aylar[7])) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("burcun : " + burclar[4]);
            } else if (gun >= 23) {
                System.out.println("burcun : " + burclar[5]);
            }
        }
        else if (ay.equals(aylar[8])) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("burcun : " + burclar[5]);
            } else if (gun >= 23 ) {
                System.out.println("burcun : " + burclar[6]);
            }
        }
        else if (ay.equals(aylar[9])) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("burcun : " + burclar[6]);
            } else if (gun >= 23) {
                System.out.println("burcun : " + burclar[7]);
            }
        }
        else if (ay.equals(aylar[10])) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("burcun : " + burclar[7]);
            } else if (gun >= 22) {
                System.out.println("burcun : " + burclar[8]);
            }
        }
        else if (ay.equals(aylar[11])) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("burcun : " + burclar[8]);
            } else if (gun >= 22) {
                System.out.println("burcun : " + burclar[9]);
            }
        }

    }
}
