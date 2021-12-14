/**
 * Даны натуральные числа К и N.  Написать метод(методы)  формирования массива А, элементами которого
 * являются числа, сумма цифр которых равна К и которые не большее N.
 */

package by.epam.jonline.module2.decompositions.decomposition12;

public class Decomposition12 {
    public static void main(String[] args) {

        int k = 5;
        int m = 40;
        int x;
        int sum = 0;
        //int[] array new int[];
        String[] arrs = new String[]{};
        String s = "";

        for (int i = 0; i <= m; i++) {
            int a = i;
            while (a > 0) {
                x = a % 10;
                a = a / 10;
                sum = sum + x;

            }
            int j = 1;
            if (sum == k){
            //    s = s + String.valueOf(i) + ",";
                arrs[j] = String.valueOf(i);
                System.out.println(arrs[j]);
                j++;
                sum = 0;

            }else{
                sum = 0;
            }

        }

    }
}
