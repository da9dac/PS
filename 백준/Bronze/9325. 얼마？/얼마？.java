import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            int s = Integer.parseInt(br.readLine());
            
            int n = Integer.parseInt(br.readLine());
            
            while (n-- > 0) {
                st = new StringTokenizer(br.readLine());
                
                int q = Integer.parseInt(st.nextToken());
                int p = Integer.parseInt(st.nextToken());
                
                s += q * p;
            }
            
            sb.append(s).append("\n");
        }
        
        System.out.println(sb);
    }
}