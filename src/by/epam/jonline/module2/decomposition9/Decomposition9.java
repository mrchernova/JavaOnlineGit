/**
 *
 */

package by.epam.jonline.module2.decomposition9;

public class Decomposition9 {
    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        int a1 = 5;
        int b1 = 3;
        double c;
        double s1;
        double s2;
        double p;
        double s;


        // Найдем площадь четырехугольника разбив его на два треугольника

        // находим третью сторону тпервого треугольника
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Гипотенуза = " + c);

        // находим площадь прямоугольного треугольника по трем сторонам
        s1 = (a * b) / 2;
        System.out.println("Площадь первого треугольника = " + s1);


        // находим площадь второго треугольника
        p = (a1 + b1 + c) / 2;
        s2 = Math.sqrt((p * (p - a1) * (p - b1) * (p - c)));
        System.out.println("Площадь второго треугольника = " + s2);


        s = s1 + s2;
        System.out.println("Площадь четырехугольника = " + s);
    }
}
