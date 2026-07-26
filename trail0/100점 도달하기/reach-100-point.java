import java.util.Scanner;
public class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        for ( int i = 0 ; i <= 100-score ; i++ ) {
            int a = score + i;
            if (a>=90 ) {
                System.out.print("A ");
            }
            else if( 80 <= a ) {
                System.out.print("B ");
            }
            else if( 70 <= a ) {
                System.out.print("C ");
            }
            else if( 60 <= a ) {
                System.out.print("D ");
            }
            else {{
                System.out.print("F ");
            }}

        }
        
    }
}