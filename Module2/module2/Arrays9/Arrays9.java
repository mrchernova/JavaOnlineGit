package by.epam.jonline.module2.Arrays9;

public class Arrays9 {
    public static void main(String[] args) {
        
        int n = 5;
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        System.out.println("Дан массив:");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
            System.out.print("[" + a[i] + "] ");
        }
        
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]){
                    count++;
                    
                    
                }
                c[i] = a[i];

                b[i] = count;    
            }
            
            System.out.print(c[i] + "="+ b[i]+ " ");
            count = 0;
        }
        
    }
}
