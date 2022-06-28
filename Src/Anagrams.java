/*
 * Solution of HackerRank  Question.
 * In HashMap File there is Import java.util.functional.BiFunction statement the is giving me error.

CODE :)

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.io.*;

public class Anagrams {
    public static void main(String[] args) {
        Map<String , Integer> dictA = new HashMap<>();
        Map<String , Integer> dictB = new HashMap<>();
        Set<String>  keyA ;
        Set<String> keyB;
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().toLowerCase().split("");
        String[] b = sc.nextLine().toLowerCase().split("");
        int num ;
         if (a.length == b.length){
            for(int i = 0; i<a.length; i++){
                if(dictA.get(a[i]) == null){
                    dictA.put(a[i], 1);
                }
                else{
                    dictA.put(a[i],dictA.get(a[i])+1);
                }
            }
             for(int j = 0; j<b.length; j++){
                if(dictB.get(b[j]) == null){
                    dictB.put(b[j],1);
                }
                else{
                    dictB.put(b[j],dictB.get(b[j])+1);
                }
            }

            keyA = dictA.keySet();
            keyB = dictB.keySet();
            if (keyA.size() == keyB.size()){
                num = 0;
                for(String s : keyA){
                    if(dictA.get(s) == dictB.get(s)){
                        num++;
                    }
                }
                if(num == keyA.size()){
                    System.out.println("Anagrams");
                }
                else{
                    System.out.println("Not Anagrams");
                }
            }
            else{
                System.out.println("Not Anagrams");
            }
        }
        else{
            System.out.println("Not Anagrams");
        }
        
        sc.close();
    }
}
*/