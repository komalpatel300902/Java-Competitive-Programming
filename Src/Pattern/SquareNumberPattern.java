package Pattern;
/*
000000
111111
222222
333333
444444
555555
*/

import java.util.Scanner;
public class SquareNumberPattern {

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    sc.close();
        for(int i = 0; i <input ; i++){
            for(int x = 0; x <input ; x++){
                System.out.print(i);
                
            }
            System.out.println();
        }
    }
}
