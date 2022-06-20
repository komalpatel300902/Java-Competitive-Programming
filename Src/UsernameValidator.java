/*
 * Solution of HackerRank Question {Username Validator}. 
 */

import java.util.Scanner;
public class UsernameValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        sc.nextLine();
        
        for(int i=0;i<row; i++){
            int num = 0;
            String s = sc.nextLine();
            if (Character.isAlphabetic(s.charAt(0)) && (s.length()>7 && s.length() < 31)){
                for(int j = 0; j<s.length();j++){
                    if (Character.isAlphabetic(s.charAt(j)) || s.charAt(j) == '_' || Character.isDigit(s.charAt(j))  ){
                        num++;
                    }
                }
                if (num == s.length()){
                    System.out.println("Valid");
                }
                else{
                    System.out.println("Invalid");
                }
            }
            else{
                System.out.println("Invalid");
            }
        }
        sc.close();
    }
}
