/*
1
22
333
4444
55555
666666
7777777
*/

import java.util.Scanner;

public class HalfTriangleNumberPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i = 1; i <= n ; i++){
            for(int x = 1; x <= i; x ++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
