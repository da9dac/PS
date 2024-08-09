import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int[] sum = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            int prev = sum[i - 1];
            x += Integer.parseInt(st.nextToken());
            sum[i] = x < k ? prev + 1 : prev;
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(m-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            
            int cnt = sum[r - 1] - sum[l - 1];
            
            sb.append(cnt).append("\n");
        }
        
        System.out.println(sb);
    }
}