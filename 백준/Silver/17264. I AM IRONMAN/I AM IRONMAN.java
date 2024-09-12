import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int w = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());
        
        Map<String, String> map = new HashMap<>();
        
        while (p-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            String name = st.nextToken();
            String res = st.nextToken();
            
            map.put(name, res);
        }
        
        int score = 0;
        boolean possible = false;
        
        while (n-- > 0) {
            String name = br.readLine();
            
            score += map.getOrDefault(name, "L").equals("W") ? w : -l;
            score = score < 0 ? 0 : score;
            
            if (score >= g) possible = true;
        }
        
        System.out.println(!possible ? "I AM IRONMAN!!" : "I AM NOT IRONMAN!!");
    }
}