/**
 * 3. Дана матрица. Вывести k-строку и p-столбец матрицы
 */

package by.epam.jonline.module2.Matrix3;

import java.util.Random;

public class Matrix3 {
    public static void main(String[] args) {
        int n = 4;
        int m = 3;

        int[][] matrix = new int[n][m];
        int p = 1;
        int k = 1;

        initMatrix(matrix);
        printMatrix(matrix);

        System.out.println();
        System.out.println(p + " - столбец(p) равен: ");
        pColumn(matrix, p);

        System.out.println();
        System.out.println(k + " - строка(k) равна: ");
        kRow(matrix, k);
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

    public static void pColumn(int[][] matrix, int p) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][p] + " ");
        }
    }

    public static void kRow(int[][] matrix, int k) {
        for (int j = 0; j < matrix[k].length; j++) {
            System.out.print(matrix[k][j] + " ");
        }
    }
}
