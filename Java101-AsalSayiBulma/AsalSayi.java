package Donguler;

public class AsalSayi {
    public static void main(String[] args) {

        for (int i=2 ; i<=100;i++){
            int sayac = 0 ;
            for (int j = 1 ; j<=i;j++) {

                if (i % j == 0) {
                    sayac++;
                }
            }
            if (sayac<=2){
                System.out.println(i+" bir asal sayıdır ");
            }
            else {
                System.out.println(i+" bir asal sayı değildir.");
            }
        }
    }
}
