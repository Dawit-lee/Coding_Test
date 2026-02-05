import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int n = sc.nextInt();
            HashMap<String, Integer> map = new HashMap<>();
            
            for (int i = 0; i < n; i++) {
            sc.next();
            String type = sc.next();
            
            map.put(type, map.getOrDefault(type, 0) + 1);
            }
            
            int result = 1;
            
            for (int val : map.values()) {
                result *= (val + 1);
            }
            
            System.out.println(result -1);
        }
    }
}