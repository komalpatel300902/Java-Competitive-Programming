package Pattern;
/*
      1
     222
    33333
   4444444
  555555555
 66666666666
7777777777777
*/
import java.util.Scanner;
public class NumberPyramidPattern {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        for (int i = 0; i < input; i++){
            for(int x = 0; x<input+i;x++){
                if(x>=input-1-i){
                    System.out.print(i+1);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
