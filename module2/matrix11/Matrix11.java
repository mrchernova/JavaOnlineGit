/**
 * 11. Матрицу 10х20 заполнить случайными числами от 0 до 15.
 * Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз
 */

package by.epam.jonline.module2.matrix11;

public class Matrix11 {

    public static void main(String[] args) {

        int n = 10;
        int m = 20;
        
        int[][] matrix = new int[n][m];

        initMatrix(matrix);
        printMatrix(matrix);

        System.out.println("Положительные элементы главной диагонали: ");
        C5ThreeAndMore(matrix);


    }

    public static void initMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 16);
            }
        }
    }

    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.format("%4s", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void C5ThreeAndMore(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {


            }
            if (matrix[i][i] > 0) {
                System.out.print(matrix[i][i] + " ");
            }
        }


    }

}
