
// *----
// **---
// ***--
// ****-
// *****
import java.util.Scanner;
public class StarDashPattern {
    // Time Complexity : O(n^2)
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int input = sc.nextInt(); 
        sc.close();  
        for(int x = 0; x < input; x++){
            for (int j = 0; j < input; j++){
                if(x >= j ){
                    System.out.print("*");  
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
