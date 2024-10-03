import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            int j = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
            
                int r = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                
                arr[i] = r * c;
            }
            
            Arrays.sort(arr);
            
            int cnt = 0;
            
            for (int i = n - 1; i >= 0; i--) {
                cnt++;
                j -= arr[i];
                if (j <= 0) {
                    sb.append(cnt).append("\n");
                    break;
                }
            }
        }
        
        System.out.println(sb);
    }
}