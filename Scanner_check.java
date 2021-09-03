

public static int checkScanner(int n) {
        int num;

        Scanner scNum = new Scanner(System.in);
        System.out.println("Номер num >>");
        while (!scNum.hasNextInt()) {
            System.out.println("Это не num число. Введите num еще раз");
            scNum.next();
        }
        num = scNum.nextInt();

        boolean ok = false;
        while (!ok) {
            if ((num > 0) & (num <= n)) {
                ok = true;
            } else {
                System.out.println("Еще раз номер num");
                num = scNum.nextInt();
            }
        }
        return num;
    }















Scanner sc = new Scanner(System.in);
System.out.println("Введите целое положительное число ");
        
        
        
while (!sc.hasNextInt()) {
  System.out.println("Это не целое число. Введите число еще раз");
  sc.next();
}
     
     
     
n = sc.nextInt();
while (n < 0) {
  System.out.println("Введите положительное число ");
  n = sc.nextInt();
}



Scanner scSt1 = new Scanner(System.in);
System.out.println("Номер первого столбца >>");
st1 = scSt1.nextInt();


Scanner scSt2 = new Scanner(System.in);
System.out.println("Номер второго столбца >>");
st2 = scSt2.nextInt();
