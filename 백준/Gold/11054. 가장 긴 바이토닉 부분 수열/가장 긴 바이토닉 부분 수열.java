import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int[] arr = new int[n];
        int[] dp = new int[n];
        int[] dpr = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
            
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        
        for (int i = n - 1; i >= 0; i--) {
            dpr[i] = 1;
            
            for (int j = n - 1; j > i; j--) {
                if (arr[j] < arr[i]) {
                    dpr[i] = Math.max(dpr[i], dpr[j] + 1);
                }
            }
            
            dp[i] += (dpr[i] - 1);
            max = Math.max(dp[i], max);
        }
        
        System.out.println(max);
    }
}