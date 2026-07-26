import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
         a[0] = sc.nextInt();
         a[1] = sc.nextInt();
         
            System.out.print(a[0]+ " ");
            System.out.print(a[1]+ " ");
           
           for (int i = 0; i < 8; i++) {
            a[i + 2] = (a[i] + a[i + 1]) % 10;   // 계산 결과를 배열에 저장!
            System.out.print(a[i + 2] + " ");
         }

        
    }
}