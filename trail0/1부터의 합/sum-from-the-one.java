import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;  i <= 100; i++) {
           int a = (i * (i+1)) / 2 ;
           if (a >= n) {
           System.out.print(i);
           break;
}
    
}
}
}