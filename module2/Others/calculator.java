package by.epam.jonline.module2.Others;

public class calculator {
    public static void main(String[] args) {
        double a = 4;
        double b = 0;
        
        
        String s = "/";
        
        
        if (s == "+"){ System.out.println(a + b); }
        
        if (s == "-"){ System.out.println(a - b); }
        
        if (s == "/"){
            if (b == 0){ 
                System.out.println("деление на 0");
            }else { 
                System.out.println(a / b); 
            }
        }
        
        if (s == "*"){ System.out.println(a * b); }
       
        
        
    }
}
