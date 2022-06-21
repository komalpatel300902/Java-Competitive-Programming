/*
 * Solution of HackerRank Question.
 * Note : Overloading of Functoin is not allowed.
 */
class Printer
{
   void printArray(Object[] j){
       for (int i=0 ; i < j.length;i++){
           System.out.println(j[i]);
       }
   }
 
}

public class GenericsInJava {
    
    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);      
    }
}
