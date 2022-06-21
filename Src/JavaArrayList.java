/*
 * Solution of HackerRank Question.
 */
import java.util.*;

public class JavaArrayList {
    
    public static void main(String[] args){
        ArrayList<String[]> k = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
    
        for (int y = 0; y<n; y++){
        String[] s = sc.nextLine().split(" ");
        k.add(s);
        }

        int q = sc.nextInt();
        for (int t = 0; t < q; t++){
            int row = sc.nextInt() ;
            int column = sc.nextInt();
            row = row -1;
            
            if(row <= k.size() && column < k.get(row).length){
                String[] l = k.get(row);
                System.out.println(l[column]);
            }
            else{
                System.out.println("ERROR!");
            }
        }
        sc.close();       
    }
}

