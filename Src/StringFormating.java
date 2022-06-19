/*
 * Solution Of hackerRank Question 
 */
import java.util.Scanner;

public class StringFormating {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int x = 0; x<3; x++){
            String zeroHolder = "";
            String[] s = sc.nextLine().split(" ");
            
            if (s[1].length() == 1){
                zeroHolder = "00";
            }
            else if (s[1].length() == 2){
                zeroHolder = "0";
            }
            System.out.println(s[0]+SpaceAdder.spaceAdder(15-s[0].length()) + zeroHolder+s[1]);
        }
        System.out.println("================================");
        sc.close();
    }
}
class SpaceAdder{
    public static String spaceAdder(int n){
        String s = "";
        for(int j = 0;j<n;j++){
            s += " ";
        }
        
        return s;
    }
}