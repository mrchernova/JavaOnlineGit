/**
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
 * действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию
 */

package by.epam.jonline.module2.decompositions.decomposition17;

import java.util.Scanner;

public class Decomposition17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите челое число");
    //    int n = sc.nextInt();
        int n = 12395349;

        System.out.println(n);

        int sum = sumDigits(n);
        System.out.println(sum);

        while (sum >= 10) {
            sum = sumDigits(sum);

            System.out.println(sum);
        }


    }

    public static int sumDigits(int a) {
        int sum = 0;
        int x;

        while (a > 0) {
            x = a % 10;
            a = a / 10;

            sum += x;
        }
        return sum;
    }

}
