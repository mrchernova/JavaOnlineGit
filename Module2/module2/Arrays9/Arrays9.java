package by.epam.jonline.module2.Arrays9;

public class Arrays9 {
    public static void main(String[] args) {

        int n = 5;
        int[] a = new int[n];
        int[] kol = new int[n];
        int[] c = new int[n];

        int max;
        int maxkol;

        System.out.println("Дан массив:");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
            System.out.print("[" + a[i] + "] ");
        }

        System.out.println();
        int count = 0;
        //-------------------------------------------------------------------------------
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;

                }
                c[i] = a[i]; // chislo
                kol[i] = count; // kolichestvo povtoreniy
            }

            System.out.print(c[i] + "=" + kol[i] + " ");
            count = 0;
        }
        //-------------------------------------------------------------------------------

        System.out.println();
        max = kol[0];
        for (int i = 0; i < kol.length; i++) {
            if (max < kol[i]) {
                max = kol[i];
            }
            

        }
        System.out.println(max);

    }
}
