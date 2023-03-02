public class TkrSayi {
    public static void main(String[] args) {
        int[] sayi ={12,1,212,2,12,11,1,1,212,0};
        for (int i = 0 ; i<sayi.length; i++){
            int sayac = 0;
            for (int j : sayi){
                if (sayi[i] == j){
                    sayac++;
                }
            }
            System.out.println(sayi[i] + " sayısı dizide " + sayac + " kadar tekrar ediyor ");
        }
    }
}
