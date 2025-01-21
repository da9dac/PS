import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String[] keys = new String[n];
        Map<String, Boolean> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String s = st.nextToken();
            keys[i] = s;
            map.put(s, false);
        }
        
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n - 1; i++) {
            map.put(st.nextToken(), true);
        }
        
        for (String key : keys) {
            if (!map.get(key)) {
                System.out.println(key);
                return;
            }
        }
    }
}