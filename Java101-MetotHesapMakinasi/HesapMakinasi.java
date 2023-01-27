package metotlar;

import java.util.Scanner;

public class HesapMakinasi {
    static Scanner sca = new Scanner(System.in);

    public static void main(String[] args) {
        boolean control = true;
        double a,b ;
        while (control){
            String menu = "Menü :\n1-toplama\n2-çıkarma\n3-çarpma\n4-bölme\n5-üslü sayı hesaplama\n6-mod alma\n7-dikdörtgen alan ve çevre hesaplama\n0-çıkış yap";
            System.out.println(menu);
            System.out.print("karınızı belrtin: ");
            int decision = sca.nextInt();
            switch (decision){
                case 1:
                    System.out.print("1.sayı :");
                    a = sca.nextDouble();
                    System.out.print("2.sayı : ");
                    b = sca.nextDouble();
                    System.out.println("sonuç : "+collection(a,b));
                    break;
                case 2:
                    System.out.print("1.sayı :");
                    a = sca.nextDouble();
                    System.out.print("2.sayı : ");
                    b = sca.nextDouble();
                    System.out.println("sonuç : "+extraction(a,b));
                    break;
                case 3:
                    System.out.print("1.sayı :");
                    a = sca.nextDouble();
                    System.out.print("2.sayı : ");
                    b = sca.nextDouble();
                    System.out.println("sonuç : "+multiplication(a,b));
                    break;
                case 4:
                    System.out.print("1.sayı :");
                    a = sca.nextDouble();
                    System.out.print("2.sayı : ");
                    b = sca.nextDouble();
                    System.out.println("sonuç : "+division(a,b));
                    break;
                case 5:
                    System.out.print("taban  :");
                    int d= sca.nextInt();
                    System.out.print("üs : ");
                    int e = sca.nextInt();
                    System.out.println("sonuç : "+exponentialnumber(d,e));
                    break;
                case 6:
                    System.out.print("mod alınacak sayı :");
                    d= sca.nextInt();
                    System.out.print("bölünecek sayı  : ");
                    e = sca.nextInt();
                    System.out.println("sonuç : "+modding(d,e));
                    break;
                case 7:
                    System.out.print("kısa kenar  :");
                    d= sca.nextInt();
                    System.out.print("uzun kenar : ");
                    e = sca.nextInt();
                    rectangle(d,e);
                    break;
                case 0:
                    control=false;
                    break;
            }
        }
    }
    static double collection(double a , double b){
        return a+b;
    }
    static double extraction(double a ,double b ){
        return a-b;
    }
    static double multiplication(double a ,double b ){
        return a*b;
    }
    static double division(double a ,double b ){
        return a/b;
    }
    static int exponentialnumber(int a , int  b ){
        int result = 1;
        for (int i = 1;i<=b;i++){
            result *=a;
        }
        return result;
    }
    static int modding(int a , int b){
        return a%b;
    }
    static void rectangle(int a ,int b){
        int environment = (2*a)+(2*b);
        int area = a*b;
        System.out.println("çevre = "+environment);
        System.out.println("alan = "+area);
    }

}

