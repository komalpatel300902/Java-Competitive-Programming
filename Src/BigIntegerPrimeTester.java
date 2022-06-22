/*
 * Solution of HackerRank Question.
 */
import java.io.*;
import java.math.BigInteger;


public class BigIntegerPrimeTester {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger number = new BigInteger(n);
        boolean result = number.isProbablePrime(1);
        if (result){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        bufferedReader.close();
    }
}
