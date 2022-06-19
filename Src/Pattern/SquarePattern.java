package Pattern;
/*

* * * * * 
* * * * *
* * * * *
* * * * *
* * * * *

*/
import java.util.Scanner;
public class SquarePattern {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        sc.close();
        for (int x = 0; x < n; x++){
            for (int i = 0; i < n; i++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
