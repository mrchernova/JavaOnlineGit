/**
 * 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
 */

package by.epam.jonline;

import java.util.Random;

public class Matrix3 {
    public static void main(String[] args) {
        int n = 4;
        int m = 3;

        int[][] matrix = new int[n][m];


        initMatrix(matrix);
        printMatrix(matrix);

        System.out.println();
        System.out.println("p - столбец равен: ");
        pColumn(matrix);

        System.out.println();
        System.out.println("k - строка равна: ");
        kRow(matrix);
    }

    // init array -------------------------------------------------------------------------------------------
    public static void initMatrix(int[][] matrix) {
        Random rand = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = rand.nextInt(10);
            }
        }
    }

    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
    // ----------------------------------------------------------------------------------------------------

    public static void pColumn(int[][] matrix) {
        int p = 0;


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (j == p) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

    public static void kRow(int[][] matrix) {
        int k = 0;

        for (int i = 0; i < matrix.length; i++) {

            System.out.print(matrix[i][k]+" ");

        }
    }


}