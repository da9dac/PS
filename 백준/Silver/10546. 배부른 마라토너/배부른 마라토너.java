import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        
        int n = Integer.parseInt(br.readLine());
        
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            name = br.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        
        for (int i = 0; i < n - 1; i++) {
            name = br.readLine();
            map.put(name, map.get(name) - 1);
        }
        
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                System.out.println(key);
                return;
            }
        }
    }
}