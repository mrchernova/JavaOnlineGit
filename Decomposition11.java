/**
 * Написать метод, определяющий, в каком из данных двух чисел больше цифр
 */

package by.epam.jonline.module2.decompositions.decomposition11;

public class Decomposition11 {
    public static void main(String[] args) {
        long a = 12345;
        long b = 567891011;

        System.out.println();

        int ai = Count(a);
        int bi = Count(b);




        if (ai == bi)
            System.out.println("В обоих числах одинаковое количество цифр");
        else {
            if (ai > bi)
                System.out.println("В числе " + a + " цифр больше, чем в "+ b);
            else
                System.out.println("В числе " + b + " цифр больше, чем в " + a);
        }

    }

    public static void MoreOrLess(int ai, int bi){


    }

    public static int Count(long x) {
        int i = 0;
        while (x > 0) {
            x = x / 10;
            i++;
        }
        return i;
    }

}
