/*
 * This program finds factorial of the given number (n).
 */
import java.util.Scanner;

public class Factorial {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        for (int i = 1; i<=n; i++){
            sum = sum*i;
        }
        System.out.println(sum);
        sc.close();
    }
}
