package by.epam.jonline.module1;

public class Test {
    public static void main(String[] args) {

        int sum;
        int x1, x2, x3;
        String s2, s3;

        x1 = 2;

        s2 = Integer.toString(x1) + Integer.toString(x1);                               // s2 = 22 строка
        x2 = Integer.parseInt(s2);                                                      // x2 = 22 число

        s3 = Integer.toString(x1) + Integer.toString(x1) + Integer.toString(x1);        // s3 = 222 строка
        x3 = Integer.parseInt(s3);                                                      // x3 = 222 число

        sum = x1 + x2 + x3;                                                             // 2 + 22 + 222 = sum 
        System.out.println(sum);
    }
}
