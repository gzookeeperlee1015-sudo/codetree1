import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = 25;
       int b = sc.nextInt();
       while (b != 25) {
          if (b > 25) {
            System.out.println("Lower");
          }
          else if (b < 25) {
            System.out.println("Higher");
          }
           b = sc.nextInt();
       }
       if ( b == 25) {
        System.out.print("Good");
       }

    }
}