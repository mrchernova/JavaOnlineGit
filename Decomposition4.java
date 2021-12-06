//https://otus.ru/nest/post/956/

package by.epam.jonline.module2.decompositions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Decomposition4 {
    public static void main(String[] args) {
        int[][] a = new int[][]{{-7, 5}, {-3, -5}, {2, 1}, {6, -6}};

        /**
         *  -7  5
         *  -3  -5  
         *  2   1
         *  6   -6
         */

/*
        List<Point> p = new ArrayList<>(Arrays.asList(  new Point(-7,5),
                                                        new Point(-3,-5),
                                                        new Point(2,1),
                                                        new Point(6,-6)
        ));
  */

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length - 1; j++) {

                System.out.println("[" + a[i][j] + "," + a[i][j + 1] + "] " + " [" + a[i + 1][j] + "," + a[i + 1][j + 1] + "]");
                System.out.println("Расстояние между точками: ");
                System.out.println(Length(a[i][j], a[i][j + 1], a[i + 1][j], a[i + 1][j + 1]));
                System.out.println();
            }

//        System.out.println(Length(a[0][0], a[0][1], a[1][0], a[1][1]));
        }
    }

    public static double Length(int x1, int y1, int x2, int y2) {
        double d;
        
        d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        
        return d;
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
