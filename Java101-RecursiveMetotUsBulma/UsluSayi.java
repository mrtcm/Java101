package metotlar;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int taban = inp.nextInt();
        int us = inp.nextInt();
        System.out.println(UsBulma(taban, us));
    }
    static int UsBulma(int taban , int us ){
        if(taban==1||us==0) return 1;
        return taban*=UsBulma(taban,us-1);

    }
}
