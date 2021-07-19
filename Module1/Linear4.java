package by.epam.jonline.module1.linear4;

import java.util.Scanner;

public class Linear4 {
    public static void main(String[] args) {
        double n;
        double x;

        Scanner sc = new Scanner(System.in);
        // check input
        System.out.println("Введите действительное число в формате nnn.ddd ");

        while (!sc.hasNextDouble()) {
            System.out.println("Это не число. Введите число в формате nnn.ddd еще раз");
            sc.next();
        }

        n = sc.nextDouble();
        
        if ((n > 1000) & (n <= 0)) {
            System.out.println("0 <= n < 1000. Попробуйте еще раз");
            sc.next();
        }


        x = (n * 1000) % 1000 + (int) n / 1000.0;

        if (x == 0) {
            System.out.println("000.000");
        } else if (x < 10) {
            System.out.println("00" + x);
        } else if (x < 100) {
            System.out.println("0" + x);
        } else {
            System.out.format("%03.3f", x);
        }


    }
}

