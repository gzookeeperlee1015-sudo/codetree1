import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = 0;
        for ( int i = a; i <= b; i++) {
            int c = 0;
            for (int j = 1; j <=i; j++ ){
                 if (i % j == 0 ) {
                    c = c+1 ;
                    
                 }
               
                    
            }
            if ( c == 3) {
                        d = d+1 ;
                    }
          
        }
        System.out.print(d);
    }
}