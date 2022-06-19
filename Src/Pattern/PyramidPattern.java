/* Incomplete

      *       
     * *
    * * *
   * * * *
  * * * * *
 * * * * * *
* * * * * * * 


*/
import java.util.Scanner;
public class PyramidPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int midDecrement = n/2;
        int midIncrement = n/2;
        for (int x = 0; x <n; x++){
            for(int i = 0; i<n; i++){
               
                if(i <= (midIncrement) && i >= (midDecrement) ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
                
            }
            System.out.println();
            if ( x%2 == 1 ){
                    midIncrement += 1;
                    
            }
            else{
                midDecrement -= 1;
                System.out.print(" ");
                
            }
            


        } 
    }
}
