package kontrolyapisi;

import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int dogumyili;

        System.out.print("Doğum Yılınız  : ");
        dogumyili = inp.nextInt();
        switch (dogumyili%12){
            case 0:
                System.out.println("Çin Zodyağı Burcunuz : Maymun ");
                break;
            case 1:
                System.out.println("Çin Zodyağı Burcunuz : Horoz");
                break;
            case 2:
                System.out.println("Çin Zodyağı Burcunuz : Köpek ");
                break;
            case 3:
                System.out.println("Çin Zodyağı Burcunuz : Domuz ");
                break;
            case 4:
                System.out.println("Çin Zodyağı Burcunuz : Fare ");
                break;
            case 5:
                System.out.println("Çin Zodyağı Burcunuz : Öküz ");
                break;
            case 6:
                System.out.println("Çin Zodyağı Burcunuz : Kaplan ");
                break;
            case 7:
                System.out.println("Çin Zodyağı Burcunuz : Taşan ");
                break;
            case 8:
                System.out.println("Çin Zodyağı Burcunuz : Ejderha ");
                break;
            case 9:
                System.out.println("Çin Zodyağı Burcunuz : Yılan ");
                break;
            case 10:
                System.out.println("Çin Zodyağı Burcunuz : At ");
                break;
            case 11:
                System.out.println("Çin Zodyağı Burcunuz : Koyun ");
                break;
        }
    }
}
