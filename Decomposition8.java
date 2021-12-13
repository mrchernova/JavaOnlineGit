/**
 * Задан массив D. Определить следующие суммы: D[1]+D[2]+D[3]; D[3]+D[4]+D[5]; D[4]+D[5]+D[6].
 * Пояснение. Составить метод(методы)  для вычисления суммы трех последовательно расположенных
 * элементов массива с номерами от k до m
 */

package by.epam.jonline.module2.decompositions.decomposition8;

public class Decomposition8 {
    public static void main(String[] args) {

        int[] d = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sum = 0;
        int k = 3;
        int m = k + 3;

        for (int i = k; i < m; i++) {
            sum = sum + d[i];
        }

        System.out.println(sum);

    }
}
