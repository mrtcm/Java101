public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("mert",10,90,100);
        Fighter f2 = new Fighter("ali",10,90,100);
        Match match =new Match(f1,f2,100,50);
        match.run();
        System.out.println("toplam yumruk sayısı: \n"+ f1.name+" = "+match.totalpunchf1+"\n"+f2.name+" = "+match.totalpunchf2);





    }
}