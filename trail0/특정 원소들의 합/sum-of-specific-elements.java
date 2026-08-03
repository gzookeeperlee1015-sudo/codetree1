import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[4][4];
        int total = 0;
        for ( int i = 0 ; i < 4 ; i++) {
            for (int j = 0 ; j < 4 ; j++) {
                a[i][j] = sc.nextInt();
            }
        }
         for ( int i = 0 ; i < 4 ; i++) {
            for (int j = 0 ; j < i+1 ; j++) {
                total = total + a[i][j];
            }
        }
        System.out.print(total);
        
    }
}