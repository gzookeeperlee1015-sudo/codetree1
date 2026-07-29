import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int count3 = 0;
       int count5 = 0;
       for (int i = 0 ; i < 10 ; i++) {
        int a = sc.nextInt();
        if( a % 3 == 0) {
            count3 = count3 + 1;
        }
        if ( a % 5 == 0) {
            count5++ ;
        }
       }
       
       System.out.print(count3 + " " + count5);
    }
}