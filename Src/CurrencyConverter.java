/*
 * There are some non Ascii charater($,￥,€) in my program 
 * therefore HackerRank has not accepted it.
 */
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        float n = sc.nextFloat();
        String[] s = String.format("%.2f",n).split("");
        String result1 = "";
        String result2 = "";
        int num = 0;
        for (int u = s.length -1 ; u >= 0; u--){
            if (s[u] == "."){
                result2 = "," + result2;
            }
            if (num == 6){
                result1 = "," + result1;
                result2 = " " + result2;
            }
            else if(num > 6 && (num-6)%2 == 0){
                result1 = "," + result1;
                result2 = " " + result2;
            }
            result1 = s[u] + result1;
            result2 = s[u] + result2;
            num++;
            
        }
        result2.replace(".", ",");
        System.out.println("US: $"+result1);
        System.out.println("India: Rs."+result1);
        System.out.println("China: ￥"+result1);
        System.out.println("France: "+result2+" €");
        sc.close() ;                   
    
    }
}


