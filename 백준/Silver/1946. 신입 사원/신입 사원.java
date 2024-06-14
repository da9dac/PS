import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][2];
            
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(arr, (a, b) -> a[0] - b[0]);
            
            int cnt = 1;
            int min = arr[0][1];
            
            for (int i = 1; i < n; i++) {
                if (arr[i][1] < min) {
                    min = arr[i][1];
                    cnt++;
                }
            }
            
            sb.append(cnt).append("\n");
        }
        
        System.out.println(sb);
    }
}