/*
 * Solution of HackerRank Question.
 */

import java.util.*;

public class JavaList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int numberOfElements = sc.nextInt();
        for(int j = 0;numberOfElements >j ; j++){
             int element = sc.nextInt();
             list.add(element);
        }
        int numberOfQuries = sc.nextInt();
        sc.nextLine();
        for (int x = 0;x < numberOfQuries;x++){
             String cmd = sc.nextLine();
             String[] values = sc.nextLine().split(" ");
             // System.out.println(cmd + " "+ values[0]+ " "+ values[1]);
             if (cmd.equals("Insert")){
                 if (Integer.parseInt(values[0]) < list.size()){
                     list.add(Integer.parseInt(values[0]),Integer.parseInt(values[1]));
                 }
                 else if(Integer.parseInt(values[0]) == list.size()){
                     list.add(Integer.parseInt(values[1]));
                }
            }
            else if(cmd.equals("Delete")){
                list.remove(Integer.parseInt(values[0]));
            }
        }
        sc.close(); 
        for(int t: list){
            System.out.print(t+" ");
        }      
     }
}
