import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1 ; i <= n ; i++) {
           
            for ( int j = 1 ; j <= n ; j++) {
                 int c = i*j ;
                 if (j != n  ) {
                System.out.print( i + " * "+ j +" = "+ c + ", " );
                 } 
                 else {
                    System.out.print( i + " * "+ j +" = "+ c );
                 }
            }
            System.out.println();
        }
        
    }
}