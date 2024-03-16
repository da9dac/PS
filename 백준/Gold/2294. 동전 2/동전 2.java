import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int[] dp = new int[100001];
        boolean[] isUsed = new boolean[100001];
        
        for (int i = 0; i < n; i++) {
            int coin = Integer.parseInt(br.readLine());
            
            if (isUsed[coin]) continue;
            isUsed[coin] = true;
            dp[coin] = 1;
            
            for (int j = coin + 1; j <= k; j++) {
                if (dp[j - coin] == 0) continue;
                if(dp[j] != 0) dp[j] = Math.min(dp[j], dp[j - coin] + 1);
                else dp[j] = dp[j - coin] + 1;
            }
        }
        
        System.out.println(dp[k] != 0 ? dp[k] : -1);
    }
}