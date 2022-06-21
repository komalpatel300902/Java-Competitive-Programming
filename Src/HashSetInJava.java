import java.util.*;

public class HashSetInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int g = 0; g < n;g++){
            String inp = sc.nextLine();
            set.add(inp);
            System.out.println(set.size());
            
        }
        sc.close();
    }
}
