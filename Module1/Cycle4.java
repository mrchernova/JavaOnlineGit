/**
 * Составить программу нахождения произведения квадратов первых 200 чисел
 */

package by.epam.jonline.module1.cycle4;

public class Cycle4 {
    public static void main(String[] args) {

        String s = "";
        int a = 1;

        for (int i = 1; i <= 200; i++) {
            s = s + " " + a * (i * i);                                  // Текущий квадрат числа умножается не предыдущий и записываетсЯ в строку для избежания переполнения типа int
            a = i * i;                                                  // А это и есть предыдущий квадрат
        }
        //System.out.println(s);
        String lastData = s.substring(s.lastIndexOf(" ") + 1);      // Обрезается все лишнее в строке s до последнего пробела
        System.out.println("Произведение квадратов первых 200 чисел = " + lastData);
    }
}

