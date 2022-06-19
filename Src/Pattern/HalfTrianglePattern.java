/*

         *
       * *
     * * *
   * * * *
 * * * * *
*/
import java.util.Scanner;

public class HalfTrianglePattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        int n = input -1;
        for(int x = 0 ; x<input; x++){
            int t = n - x;
            for(int i = 0; i <input; i++){
                
                if (i < t){
                    System.out.print("  ");
                }
                else if (i >=t){
                    System.out.print(" *");
                }
            }
            System.out.println();
            
        }
    }
}
