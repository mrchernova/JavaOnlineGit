package epam.java.basics;

public class Basics_z1 {
    public static void main(String[] args) {
      /* 1
        System.out.println("z = (( a - 3 ) * b / 2) + c");
        int a = 4;
        int b = 2;
        int c = 1;
        
        int z = (( a - 3 ) * b / 2) + c;
        System.out.println(z);
        
       */

        /* 2
        System.out.println("z = ((b+ Math.sqrt(Math.pow(b,2) + (4*a*c)))/(2*a)) - Math.pow(a,3)*c + Math.pow(b,-2)");
        double a = 2;
        double b = 1;
        double c = 1;
        double z;
        
        if (a==0){
            System.out.println("dividing by zero");
            
        }else {
            z = ((b + Math.sqrt(Math.pow(b, 2) + (4 * a * c))) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
            System.out.println(z);
        }
        */


        //3 Синусы-косинусы
        /*
        System.out.println("((sin[x]+cos[y]) / (cos[x]-sin[y])) * tg[xy]");

        double degreesx = 30;
        double radiansx = Math.toRadians(degreesx);
        double sinx = Math.sin(radiansx);               System.out.format("sinx = %.1f \n", sinx);
        double cosx = Math.cos(radiansx);               System.out.format("cosx = %.1f \n", cosx);

        double degreesy = 30;
        double radiansy = Math.toRadians(degreesy);
        double siny = Math.sin(radiansy);               System.out.format("siny = %.1f \n", siny);
        double cosy = Math.cos(radiansy);               System.out.format("cosy = %.1f \n", cosy);

        // format to string  ------------------------------
        String ssinx = String.format("%.1f \n", sinx);
        String scosx = String.format("%.1f \n", cosx);
        String ssiny = String.format("%.1f \n", siny);
        String scosy = String.format("%.1f \n", cosy);
        //------------------------------------------------

        // string to double  -----------------------------                       
        double numsinx = Double.parseDouble(ssinx);     //System.out.println(numsinx);
        double numcosx = Double.parseDouble(scosx);     //System.out.println(numcosx);
        double numsiny = Double.parseDouble(ssiny);     //System.out.println(numsiny);
        double numcosy = Double.parseDouble(scosy);     //System.out.println(numcosy);
        //----------------------------------------------
        
        double tgxy = (numsinx/numcosx)*(numsiny/numcosy);
        System.out.println("tgxy " + tgxy);
        */


        //4 Такое только другое
        /*
        double n = 123.789;
        
        double x = (n * 1000) % 1000 + (int) n / 1000.0 ;
        System.out.println(x);
        
        */


        //5 Секунды в часы
        /*
        int t = 780;
        //output hours
        int h = t/3600;
        
        //output minutes
        int m = (t-h*3600)/60;
        
        //output seconds
        int s = (t-h*3600)-60*m;

        System.out.println(h+"ч "+ m+"мин "+ s+"сек");
        
                                                                //int n = 00;
                                                                //System.out.printf("%02d", n);
                                                                //%02d означает "форматировать целое число с 2 цифрами, заполняя его нулями
                                                                //%n - new line
                                                                
                                                                //n$ для явного индексирования аргументов
                                                                //
                                                                //System.out.printf("%1$s! %1$s %2$s! %1$s %2$s %3$s!",
                                                                //    "Du", "hast", "mich"
                                                                
        System.out.printf("%02d", h+"ч "+ m+"мин "+ s+"сек");
        */


        //6 Координаты
        /*
        int x = -2;
        int y = -2;
        
       if ((x>=-2 & x<=2) & (y>=0 & y<=4) || (x>=-4 & x<=4) & (y<=0 & y>=-3)) { 
           System.out.println("prin");
       }else{
           System.out.println("not");
       
        */

        //7 Треугольники
      /*
       int a = 91;
        int b = 55;
        int c;

        c = 180 - a - b;
        if (c > 0) {
            if (a == 90 || b == 90 || c == 90) {
                System.out.println("Прямоугольный треугольник");
            } else{
                System.out.println("Треугольный треугольник");
            }
        }else {
            System.out.println("Не треугольник");
        }
        
       */

        //8 min-max
        /*
        int a = 12;
        int b = 3;
        int c = 0;
        int d = 0;
        System.out.println(Math.max(Math.min(a,b),Math.min(c,d)));
        */


        //9 line
        /*
     int x1 = 2; //A
     int y1 = 1; //A
     int x2 = 1; //B
     int y2 = 3; //B
     int x3 = 1; //C
     int y3 = 4; //C
     
     if ( (y2-y1)*(x3-x1) - (x2-x1)*(y3-y1) == 0){
         System.out.println("Точки лежат на одной прямой");
     }else{
         System.out.println("Точки не лежат на одной прямой");
     }
    */

        //10 Brick
    /*    
    int A = 10;
    int B = 20;
        
    int x = 19;
    int y = 25;
    int z = 9;

    if (((A>x) & (B>y)) || ((A>y) & (B>x))
    || ((A>x) & (B>z)) || ((A>z) & (B>x))
    || (((A>z) & (B>y)) || ((A>y) & (B>z)))){
            System.out.println("Yes");
        
        }else{
            System.out.println("No");
        }
*/

        //11 F(x)
        /*
        int x = 4;
        double z;
        
        if (x <= 3) {
            z = Math.pow(x,2)- 3*x + 9;
        } else{
            z = 1/(Math.pow(x,3)+6);
        }
        System.out.println(z);
        */

        //12 sum num
        /*
        int n = 5;
        long sum = 0;
        int i;

        for (i = 0; i <= n; ++i ) {
            sum = sum + i;
        }
        System.out.println("sum from 1 to " + n + " = " +sum);
        */
    }
}
