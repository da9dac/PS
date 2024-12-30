import java.io.*;
import java.util.*;

class Main {
    static final String CASE = "Case ";
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int idx = 1;
        
        while (true) {
            st = new StringTokenizer(br.readLine());
            
            int l = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            
            if (l + p + v == 0) break;
            
            int cnt = 0;
            
            int x = v / p;
            cnt += x * l;
            
            int y = v % p;
            cnt += y <= l ? y : l;
            
            sb.append(CASE).append(idx++).append(":").append(" ").append(cnt).append("\n");
        }
        
        System.out.println(sb);
    }
}