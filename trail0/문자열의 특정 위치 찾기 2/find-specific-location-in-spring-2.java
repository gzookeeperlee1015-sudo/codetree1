import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = {"apple", "banana", "grape", "blueberry", "orange"};
        char b = sc.next().charAt(0);
        int count = 0;

        for( int i = 0 ; i < a.length ; i++) {
            if( a[i].length() > 3) {
                if( a[i].charAt(2) == b || a[i].charAt(3) == b ) {
                    count++;
                    System.out.println(a[i]);
                }
            }

        }
        System.out.print(count);
        
        
    }
}