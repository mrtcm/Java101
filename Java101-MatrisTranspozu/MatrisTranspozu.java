import java.util.Arrays;

public class MatrisTranspozu {
    static void loop(int[][] array){
        for (int[] i : array){
            for (int j : i ){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //satırlar sütun olucak

        int[][] array = {{1,2,3},{4,5,6}};
        int[][] tempArray = new int[array[0].length][array.length];
        for (int i =  0; i<array.length;i++){
            for (int j = 0 ; j<array[i].length;j++){
                tempArray[j][i] = array[i][j];
            }
        }
        System.out.println("dizi : ");
        loop(array);
        System.out.println("transpoze dizi : ");
        loop(tempArray);


    }
}
