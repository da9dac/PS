import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            int min = 101;
            int sum = 0;
            
            for (int i = 0; i < 7; i++) {
                int x = Integer.parseInt(st.nextToken());
                
                if (x % 2 == 0) {
                    min = Math.min(min, x);
                    sum += x;
                }
            }
            
            sb.append(sum).append(" ").append(min).append("\n");
        }
        
        System.out.println(sb);
    }
}