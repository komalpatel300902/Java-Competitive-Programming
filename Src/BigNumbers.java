/*
 * Solution of HackerRank Question.
 */

import java.util.Scanner;
import java.math.BigInteger;
public class BigNumbers {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        String q = sc.nextLine();
        BigInteger a = new BigInteger(p);
        BigInteger b = new BigInteger(q);
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        sc.close();
    }
}
