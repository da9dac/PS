import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[][] dp = new int[n + 1][m + 1];
        
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= m; j++) {
                int max = Math.max(dp[i-1][j-1], Math.max(dp[i-1][j], dp[i][j-1]));
                dp[i][j] = max + Integer.parseInt(st.nextToken());
            }
        }
        
        System.out.println(dp[n][m]);
    }
}