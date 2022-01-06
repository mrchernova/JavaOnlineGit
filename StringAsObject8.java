/**
 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
 * Случай, когда самых длинных слов может быть несколько, не обрабатывать
 */

package by.epam.jonline.module3.string_as_object8;

public class StringAsObject8 {
    public static void main(String[] args) {
        //StringBuilder sb = new StringBuilder("qwerty asdfasdf zxc");
        StringBuilder sb = new StringBuilder("qwerty asdfasdf zxc");

        String max_word = "";

        System.out.println(sb);

        int l = sb.length();
        System.out.println(l);

        for (int i = 0;i<sb.length(); i++){

            if (Character.toString(sb.charAt(0)) != " "){
                System.out.print(Character.toString(sb.charAt(0)));
            }

        }
        System.out.println();




    }
}
