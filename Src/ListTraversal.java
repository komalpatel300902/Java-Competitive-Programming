/*
 * Traversing List
 */

import java.io.*;
import java.util.*;

public class ListTraversal {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> list = new ArrayList<>();
        for (int u =0; u<n;u++){
            int m = Integer.parseInt(bufferedReader.readLine().trim());            list.add(m);
        }
        
        bufferedReader.close();
        for(Integer h : list){
            System.out.println(h);
        }
    }
}
