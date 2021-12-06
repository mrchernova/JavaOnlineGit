/**
 * Даны дроби
 * Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания
 */

package by.epam.jonline.module2.decompositions.decomposition2;

import java.util.Arrays;

public class decomposition2 {

    public static void main(String[] args) {

        int[] array = new int[]{6, 2, 2, 8};
        System.out.println(Arrays.toString(array));

        
        System.out.println(NOD4(array));
    }

    //find NOD for all denominators
    public static int NOD4(int[] a) {
        int t = a[0];
        for (int i = 1; i < a.length; i++) {
            t = NOD(t, a[i]);
        }
        return t;
    }

    public static int NOD(int a, int b) {
        int tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

}
