import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[n + 1];
        
        dp[0] = 1;
        
        for (int i = 1; i <= n; i++) {
            int idx = i - 1;
            for(int j = 0; j < i; j++) {
                dp[i] += (dp[j] * dp[idx--]);
            }
        }
        
        System.out.println(dp[n]);
    }
}