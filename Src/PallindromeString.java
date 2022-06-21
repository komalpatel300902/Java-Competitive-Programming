/*
 * Solution of pallindrome String Problem.
 */
import java.util.Scanner;

public class PallindromeString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        int  num = 0;
        for(int x = 0; x < inp.length();x++){
            if (inp.charAt(x) == inp.charAt(inp.length()-1-x)){
                num++;
            }
        }
        if (num == inp.length()){
           System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}
