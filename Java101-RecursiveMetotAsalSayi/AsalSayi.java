package metotlar;

import java.util.Scanner;

public class AsalSayi {

    public static boolean asalsayi(int n, int i) {
        if (n <= 1) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return asalsayi(n, i - 1);
    }

    public static void main(String[] args) {
        int n = 17;
        int i = n / 2;
        if (asalsayi(n, i)) {
            System.out.println(n + " asal sayıdır .");
        } else {
            System.out.println(n + " asal değildir.");
        }
    }

}
