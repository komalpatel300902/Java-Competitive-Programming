/*
1
12
1x3
1xx4
1xxx5
1xxxx6
1xxxxx7
12345678

*/


import java.util.Scanner;
public class NumberPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int x = 1 ; x< n+1; x++){
            for (int i = 1; i<=x;i++ ){
                if ( i == 1 || x == n || i ==x  ){
                    System.out.print(i);
            
                }
                else{
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }
}
