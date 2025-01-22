import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            int min = 361;
            int first = 0;
            int cnt = 0;
            
            int k = Integer.parseInt(br.readLine());
            boolean[] numbers = new boolean[1000001];
            st = new StringTokenizer(br.readLine());
            
            for (int i = 0; i < k; i++) {
                numbers[Integer.parseInt(st.nextToken())] = true;
            }
            
            int n = Integer.parseInt(br.readLine());
            
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                
                int num = Integer.parseInt(st.nextToken());
                int h = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());
                
                if (!numbers[num]) continue;
                if (h == -1) continue;
                
                int time = h * 60 + m;
                
                if (time > 360) continue;
                
                cnt++;
                
                if (min > time) {
                    min = time;
                    first = num;
                }
            }
            
            sb.append(first).append(" ").append(cnt).append("\n");
        }
        
        System.out.println(sb);
    }
}