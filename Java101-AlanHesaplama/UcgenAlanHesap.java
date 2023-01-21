import java.util.Scanner;

public class UcgenAlanHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double  cevre,alan  ,kenar1,kenar2,kenar3;
        double  u = 0  ;

        System.out.print("1.kenar : ");
        kenar1 = input.nextDouble();
        System.out.print("2.kenar : ");
        kenar2 = input.nextDouble();
        System.out.print("3.kenar : ");
        kenar3 = input.nextDouble();
        u = (kenar2+kenar1+kenar3)/2;
        cevre = 2*u;
        double alank =  u*(u-kenar1)*(u-kenar2)*(u-kenar3);
        alan = Math.sqrt(alank);
        System.out.println("alan : " + alan);
        System.out.println("çevre : "+ cevre);


    }
}
