/**
 * 8. В числовой матрице поменять местами два столбцалюбых столбца, т. е. все элементы одного столбца
 * поставить на соответствующие им позиции другого, а его элементы второго переместить в первый.
 * Номера столбцов вводит пользователь с клавиатуры
 */

package by.epam.jonline.module2.matrix8;

import java.util.Scanner;

public class Matrix8 {
    public static void main(String[] args) {

        int n = 5;
        int st1;
        int st2;
        
        int[][] matrix = new int[n][n];

        initMatrix(matrix);
        printMatrix(matrix);


        System.out.println("Введите номера столбцов, которые  нужно поменять местами");
        st1 = checkScanner(n);
        st2 = checkScanner(n);

        System.out.println(st1);
        System.out.println(st2);
        
        

        System.out.println("Матрица после замены столбцов:");
        searchAndReplace(matrix, st1, st2);
    }

    public static void initMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                matrix[i][j] = (int) (Math.random() * 20 - 10);
            }
        }
    }


    /*----------------------------------------------------------------------------------------------------------------------*/

    public static int checkScanner(int n) {
        int num;

        Scanner scNum = new Scanner(System.in);
        System.out.println("Номер num >>");
        while (!scNum.hasNextInt()) {
            System.out.println("Это не num число. Введите num еще раз");
            scNum.next();
        }
        num = scNum.nextInt();

        boolean ok = false;
        while (!ok) {
            if ((num > 0) & (num <= n)) {
                ok = true;
            } else {
                System.out.println("Еще раз номер num");
                num = scNum.nextInt();
            }
        }
        return num;
    }


    public static void searchAndReplace(int[][] matrix, int st1, int st2) {

        // Выравнивание для удобства пользователя
        st1--;
        st2--;


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                if (j == st1) {
                    System.out.format("%3s", matrix[i][st2]);
                } else {
                    if (j == st2) {
                        System.out.format("%3s", matrix[i][st1]);
                    } else {
                        System.out.format("%3s", matrix[i][j]);
                    }
                }
            }
            System.out.println();
        }
    }
    /*----------------------------------------------------------------------------------------------------------------------*/

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

/* 
 
 Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое положительное число ");
        
        while (!sc.hasNextInt()) {
            System.out.println("Это не целое число. Введите число еще раз");
            sc.next();
        }
            n = sc.nextInt();
            while (n < 0) {
                System.out.println("Введите положительное число ");
                n = sc.nextInt();
            }
 */
