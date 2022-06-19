

/*
* * * * * * * * 
* * * * * * * -
* * * * * * - -
* * * * * - - -
* * * * - - - -
* * * - - - - -
* * - - - - - -
* - - - - - - -
*/

import java.util.Scanner;
public class StarDashPatternHorizontalMirror {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        // Time Complexity : O(n^2)
        for (int x = 0; x < input; x++){
            for (int j = 0; j < input; j++){
                if(input -x-1 >=   j ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
