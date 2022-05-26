package by.epam.jonline.module3.regex1.Step5Sort;

public class SortParagraph {
    public static String sortParagraph(String s) {


        String[] paragraphs = s.split("\n");

        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = paragraphs[i].split("[.!?]");
            System.out.println("Предложений в абзце " + i + ": " + sentences.length);
        }
        System.out.println("Абзацев в строке: " + paragraphs.length);

        return "Абзацев в строке: " + Integer.toString(paragraphs.length);
    }


}
