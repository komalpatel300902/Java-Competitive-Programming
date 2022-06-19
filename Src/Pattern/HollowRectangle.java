package Pattern;
/*
**********
*        *
*        *
*        *
*        *
*        *
*        *
**********

*/
import java.util.Scanner;
public class HollowRectangle{
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i = 0; i<n;i++){
            for(int x = 0; x<n+2;x++){
                if (x==0 || i==0||i == n-1||x==n+1){
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