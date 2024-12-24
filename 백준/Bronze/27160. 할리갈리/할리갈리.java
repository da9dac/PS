import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        
        Map<String, Integer> map = new HashMap<>();
        
        boolean isFive = false;
        
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            String fruit = st.nextToken();
            int x = Integer.parseInt(st.nextToken());
            
            map.put(fruit, map.getOrDefault(fruit, 0) + x);
        }
        
        for (String key : map.keySet()) {
            if (map.get(key) == 5) {
                isFive = true;
                break;
            }
        }
        
        System.out.println(isFive ? "YES" : "NO");
    }
}