import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        int[] dp = new int[1001];
        
        for (int i = 1; i <= 1000; i++) {
            dp[i] = 1;
            
            for (int j = 1; j <= i / 2; j++) {
                dp[i] += dp[j];
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            
            sb.append(dp[n]).append("\n");
        }
        
        System.out.println(sb);
    }
}