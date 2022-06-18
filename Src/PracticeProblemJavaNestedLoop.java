/*
 * This is Solution of HackerRank Question .
 */

import java.util.*;
import java.lang.Math;

public class PracticeProblemJavaNestedLoop{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int holder = 1;
            for (int j = 1;j<=n;j++){
                holder = a+ b*((int)Math.pow(2,j)-1);
                System.out.print(holder + " ");
            }
            System.out.println();
        }
        in.close();
        
    }
}