import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int d = a.length();
        int c = b.length();
        if (b.length() > a.length()) {
            System.out.printf("%s %d", b, c);
        }
        else if (b.length() < a.length()) {
            System.out.printf("%s %d", a, d);
        }
        else {
            System.out.print("same");
        }
        
        
    }
}