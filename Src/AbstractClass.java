/*
 * Solution of HackerRank Question.
 */

import java.util.*;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class MyBook extends Book{
    @Override
    void setTitle(String s){
        super.title = s;
    }
    
}

public class AbstractClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MyBook mb = new MyBook();
        String bookName = sc.nextLine();
        mb.setTitle(bookName);
        System.out.println("The title is: "+mb.getTitle());
        sc.close();
    }
}
