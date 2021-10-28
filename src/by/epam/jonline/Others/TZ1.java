package by.epam.jonline.Others;
/**
 * testtesttest
 */

import java.util.Scanner;

public class TZ1 {
    public static void main(String[] args) {

        int n = 2;                                  // размер будущей квадратной матрицы
        String s = "";
        String word = "";  
        char[][] charStrMatrix = new char[n][n];

        // проверка на правильность ввода строк
        Scanner scW = new Scanner(System.in);
        System.out.println("Введите слово, которое нужно найти");
        word = scW.nextLine();

        while (word.trim().isEmpty()) {
            System.out.println("Строка пуста попробуйте еще раз");
            word = scW.next();
        }
        word = word.toUpperCase();
        System.out.println("Ваше слово: " + word);


        Scanner scS = new Scanner(System.in);
        System.out.println("Введите строку из " + n * n + " символов");
        s = scS.nextLine();

        while (s.trim().isEmpty()) {
            System.out.println("Строка s пуста. Попробуйте еще раз");
            s = scS.next();
        }
        while (s.length() != n * n) {
            System.out.println("Введите строку из " + n * n + " символов");
            s = scS.next();
        }
        s = s.toUpperCase();
        System.out.println("Ваша строка: " + s);


        // преобразование строк в массив
        char[] charWord = word.toCharArray();       
        char[] charS = s.toCharArray();             


        initMatrixS(charStrMatrix, charS, n);       // формирует матрицу из строки 
        printMatrixS(charStrMatrix);                // выводит полученную матрицу
        searchInMatrixS(charStrMatrix, charWord);   // выводит ответ
    }


    // Создание матрицыы
    public static void initMatrixS(char[][] charStrMatrix, char[] charS, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                charStrMatrix[i][j] = charS[i * n + j];
            }
        }
    }


    // Поиск в матрице
    public static void searchInMatrixS(char[][] charStrMatrix, char[] charWord) {

        boolean br = false;     // для прерывания цикла 
        boolean flag = false;   // для проверки на наличие хотя бы одного элемента в матрице из "СЛОВА". Если false - их нет
        byte x = 0;             // считает сколько элементов из "СЛОВА" было найдено в матрице 
        String outS = "";

        for (int c = 0; c < charWord.length; c++) {

            for (int i = 0; i < charStrMatrix.length; i++) {
                for (int j = 0; j < charStrMatrix.length; j++) {

                    if (charWord[c] == charStrMatrix[i][j]) {
                        outS = outS + "[" + i + "," + j + "]";
                        flag = true;
                        x++;
                        if (c < charWord.length - 1) {
                            outS = outS + "->";
                        }
                        br = true;
                        break;
                    }
                }
                if (br) {
                    br = false;
                    break;
                }
            }

        }
        if ((!flag) || (x != charWord.length)) {
            System.out.println("Данного слова целиком в строке нет");
        } else {
            System.out.println(outS);
        }

    }


    // Вывод матрицы
    public static void printMatrixS(char[][] charStrMatrix) {
        
        for (int i = 0; i < charStrMatrix.length; i++) {
            for (int j = 0; j < charStrMatrix.length; j++) {
                System.out.print(charStrMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
