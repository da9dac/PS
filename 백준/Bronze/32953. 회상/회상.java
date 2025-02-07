import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Map<Integer, Integer> map = new HashMap<>();
        
        while (n-- > 0) {
            int k = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            
            for (int i = 0; i < k; i++) {
                int x = Integer.parseInt(st.nextToken());
                
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }
        
        int cnt = 0;
        
        for (int key : map.keySet()) {
            if (map.get(key) >= m) cnt++;
        }
        
        System.out.println(cnt);
    }
}