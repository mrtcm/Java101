public class DiziOrt {
    public static void main(String[] args) {
        int ort = 0 ;
        int[] liste = {1,2,31,1,321,21,2};
        ort = liste.length / harmonikseri(liste);
        System.out.println("ortalama = " + ort );
    }
    static int harmonikseri(int[] liste){
        int harmonikseri = 0;
        for (int i =0 ; i<liste.length;i++ ){
            harmonikseri += 1/liste[i];
        }
        return harmonikseri;
    }
}
