package kontrolyapisi;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int yil;

        System.out.print("bir yıl giriniz : ");
        yil  = inp.nextInt();
        if(yil%4==0) {
            if (yil % 400 == 0 && yil % 100 == 0) {
                System.out.println(yil + " bir artık yıldır .");
            }
            else {
                System.out.println(yil+" bir artık yıl değildir.");
            }
        }
        else {
            System.out.println(yil+" bir artık yıl değildir.");
        }
    }
}
