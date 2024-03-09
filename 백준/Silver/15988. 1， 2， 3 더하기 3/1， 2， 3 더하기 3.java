import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        int[] tc = new int[t];
        int max = 0;
        
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            
            tc[i] = n;
            max = Math.max(n, max);
        }
        
        long[] dp = new long[1000001];
        
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        
        for (int i = 4; i <= max; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % 1_000_000_009;
        }
        
        for (int i : tc) {
            sb.append(dp[i]).append("\n");
        }
        
        System.out.println(sb);
    }
}