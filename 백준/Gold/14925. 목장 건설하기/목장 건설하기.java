import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int max = 0;
        
        int[][] land = new int[m + 1][n + 1];
        int[][] dp = new int[m + 1][n + 1];
        
        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                land[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (land[i][j] != 0) continue;

				int min;

				int ul = land[i - 1][j - 1];
				int u = land[i - 1][j];
				int l = land[i][j - 1];

				if (ul + u + l != 0) min = 0;
				else {
					min = Math.min(dp[i - 1][j - 1], dp[i - 1][j]);
					min = Math.min(min, dp[i][j - 1]);
				}

				dp[i][j] = min + 1;
				max = Math.max(max, dp[i][j]);
            }
        }
        
        System.out.println(max);
    }
}