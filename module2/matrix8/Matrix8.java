/**
 * 8. В числовой матрице поменять местами два столбцалюбых столбца, т. е. все элементы одного столбца
 * поставить на соответствующие им позиции другого, а его элементы второго переместить в первый.
 * Номера столбцов вводит пользователь с клавиатуры
 */

package by.epam.jonline.module2.matrix8;

public class Matrix8 {
    public static void main(String[] args) {

        int n = 5;
        int[][] matrix = new int[n][n];

        initMatrix(matrix);
        printMatrix(matrix);
    }

    public static void initMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                matrix[i][j] = (int)(Math.random() * 20 - 10);
            }
        }
    }


    public static void printMatrix(int[][] matrix) {

        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.format("%3s", matrix[i][j]);

            }
            System.out.println();
        }

    }


}
