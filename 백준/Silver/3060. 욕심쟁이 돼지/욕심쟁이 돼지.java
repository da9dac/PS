import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine());
        
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            
            long sum = 0;
            int day = 1;
            
            for (int i = 0; i < 6; i++) sum += Integer.parseInt(st.nextToken());
            
            while (sum <= n) {
                sum *= 4;
                day++;
            }
            
            sb.append(day).append("\n");
        }
        
        System.out.println(sb);
    }
}