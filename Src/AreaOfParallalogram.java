import java.io.*;

public class AreaOfParallalogram {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
                int breadth = Integer.parseInt(br.readLine());
                int heigth = Integer.parseInt(br.readLine());
                if (heigth >0 && breadth > 0){
                    System.out.println(heigth*breadth);
                }
                else{
                    System.out.println("java.lang.Exception: Breadth and height must be positive");
                }
            }
            catch (IOException ioe){
                System.out.print("");
            }
    }

}