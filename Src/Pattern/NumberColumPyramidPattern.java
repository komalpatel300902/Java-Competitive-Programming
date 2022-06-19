package Pattern;
/*
      1
     212
    32123
   4321234
  543212345
 65432123456
7654321234567
*/
import java.util.Scanner;
public class NumberColumPyramidPattern {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
     
        for (int i = 0; i < input; i++){
            for(int x = 0; x<input+i;x++){
                if(x>=input-1-i){
                    if(x <= input-1){
                        System.out.print(input-x);
                    }
                    else{
                        System.out.print(x-input+2);
                    }
                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
