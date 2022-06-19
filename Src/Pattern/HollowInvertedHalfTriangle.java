/*
*********
*      *
*     *
*    *
*   *
*  *
* *
**
*

*/

import java.util.Scanner;

public class HollowInvertedHalfTriangle {
    

    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
        sc.close();
        for (int x = 0 ; x<n;x++){
            int last = n-x;
            for(int i = 0 ; i<last;i++){
                if(i == 0 || x == 0 || i == n-x-1 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}

