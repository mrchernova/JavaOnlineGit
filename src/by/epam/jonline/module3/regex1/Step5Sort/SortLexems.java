/**
 * Сортировка лексем в предложении по убыванию количества вхождений заданного символа, а в случае равенства - по лфавиту
 */
package by.epam.jonline.module3.regex1.Step5Sort;

public class SortLexems {
    public static void sortLexems(String s) {

/*
        String s_trim = s.replaceAll("[~@#$%^&*()_+=,\"»«:;]", "");
        String[] sentence = s_trim.split("[.!?]");
        String[] word = {};

        Form.outputArea.setText("");
        for (int i = 0; i < sentence.length; i++) {                 // for (String value : sentence) {word = value.trim().split(" ");}
            word = sentence[i].trim().split(" ");             // или такая запись

            for (int j = 0; j < word.length; j++) {
                for (int k = j + 1; k < word.length; k++) {

                    if (word[j].length() > word[k].length()) {
                        String x = word[k];
                        word[k] = word[j];
                        word[j] = x;
                    }

                }
                Form.outputArea.append(word[j] + " | ");
            }
            Form.outputArea.append("\n");

        }
*/



    }

}
