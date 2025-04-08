import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int k = Integer.parseInt(br.readLine());
        
        while(k-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            int p = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int cnt = 0;
            
            boolean[] arr = new boolean[m];
            
            while (p-- > 0) {
                int x = Integer.parseInt(br.readLine()) - 1;
                
                if (arr[x]) {
                    cnt++;
                    continue;
                }
                
                arr[x] = true;
            }
            
            sb.append(cnt).append("\n");
        }
        
        System.out.println(sb);
    }
}