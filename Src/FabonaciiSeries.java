/*
 *  This Program print febinacci series of n term.
 */
import java.util.Scanner;

public class FabonaciiSeries {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int a1 = 1;
        int a2 = 1;
        int holder;

        if (n == 1){
            System.out.print(1 + " ");
        }
        if (n >= 2){
            System.out.print(1+ " " + 1 + " ");
        }
        for(int i = 1; i < n-1; i++){
            holder = a1+a2;
            a1 = a2;
            a2 = holder;
            System.out.print(a2 + " ");
        }
    }
}

