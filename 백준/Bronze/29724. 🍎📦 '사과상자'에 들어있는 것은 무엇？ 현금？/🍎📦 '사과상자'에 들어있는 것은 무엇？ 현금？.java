import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int g = 0;
        
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            String t = st.nextToken();
            
            if (t.equals("B")) {
                g += 6000;
                continue;
            }
            
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            
            int x = w / 12;
            int y = l / 12;
            int z = h / 12;
            
            if (x == 0 || y == 0 || z == 0) {
                g += 1000;
                continue;
            }
            
            int a = x * y * z;
            
            cnt += a;
            g += (a * 500 + 1000);
        }
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(g).append("\n").append(cnt * 4000);
        
        System.out.println(sb);
    }
}