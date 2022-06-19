package Pattern;
/*
n = 2   
-*
***

n=3     
--*
-***
*****

n= 5    
----*
---***
--*****
-*******
*********
*/

import java.util.Scanner;
public class StarDashPyramidPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        for (int x = 0; x < input;x++){
            for(int i =0 ; i<input+x;i++){
                if (i >= input-1-x){
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
