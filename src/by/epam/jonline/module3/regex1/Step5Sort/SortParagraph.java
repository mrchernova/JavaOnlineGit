package by.epam.jonline.module3.regex1.Step5Sort;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class SortParagraph {
    public static void sortParagraph(String s) {

        String[] paragraph = s.split("\n");
        String[] sentence = {};


        for (int i = 0; i < paragraph.length; i++) {
            sentence = paragraph[i].split("[.!?]");
            System.out.println(Arrays.toString(sentence));
            System.out.println(sentence.length);


        }
        Arrays.sort(paragraph,);
        System.out.println(Arrays.toString(paragraph));
      //  System.out.println(paragraph[0]);

//  print(sorted(result, key=lambda point: str(point).count('.')), file=file_output)

    }
}
