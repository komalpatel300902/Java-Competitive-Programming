/*
 * Solution of HackerRank Question.
 */

import java.util.*;

public class StringComparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int size = sc.nextInt();
        ArrayList<String> words = new ArrayList<>();
        for(int x = 0;x<line.length()-size+1;x++){
            words.add(line.substring(x,x+size));
        }
        Collections.sort(words);
        System.out.println(words.get(0));
        System.out.println(words.get(words.size()-1));
        sc.close();
    }
}
