import java.util.Scanner;

public class DaireAlanHesaplama {
    public static void main(String[] args) {
        double yaricap,alan,pi=3.14;
        int merkezaci;
        Scanner input = new Scanner(System.in);
        System.out.print("çemberin yarıçapını giriniz : ");
        yaricap=input.nextDouble();
        System.out.print("merkez açısını giriniz : ");
        merkezaci = input.nextInt();
        alan = (pi*(yaricap*yaricap)*merkezaci)/360;
        System.out.println("daire diliminin alanı : "+ alan);
    }
}
