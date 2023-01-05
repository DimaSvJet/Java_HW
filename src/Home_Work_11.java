import java.util.Random;
import java.util.Scanner;

public class Home_Work_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Уведіть кількість рядків Вашої матриці: ");
        int m = scanner.nextInt();
        System.out.print("Уведіть кількість елементів Вашої матриці: ");
        int n = scanner.nextInt();

        int[][] matrixMxN = new int[m][n];
        int[][] matrixTransposed =new int[n][m];

        Random random = new Random();

        //create matrixMxN
        System.out.println("Your matrix with random elements 0-9");
        for (int i = 0; i <m; i++) {
            for (int j = 0; j < n; j++) {
                matrixMxN[i][j] = random.nextInt(10);
                System.out.print(matrixMxN[i][j]+" ");
                            }
            System.out.println();
        }
        //create Transposed matrix
       System.out.println("Transposed matrix");
       for (int i = 0; i < matrixTransposed.length; i++) {
           for (int j = 0; j <matrixTransposed[i].length; j++) {
               matrixTransposed[i][j]=matrixMxN[j][i];
           System.out.print((matrixTransposed[i][j])+" ");
           }
           System.out.println();
       }
    }
}



