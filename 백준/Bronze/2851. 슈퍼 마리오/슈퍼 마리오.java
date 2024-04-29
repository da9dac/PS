import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] dp = new int[10];
        
        dp[0] = Integer.parseInt(br.readLine());
        
        int max = dp[0];
        int idx = 0;
        
        for(int i = 1; i < 10; i++) {
            dp[i] = dp[i - 1] + Integer.parseInt(br.readLine());
            
            if (dp[i] <= 100) {
                max = dp[i];
                idx = i;
            }
        }
        
        if (max == 100) {
			System.out.println(100);
		} else if (idx != 9) {
			int prev = 100 - dp[idx];
			int next = dp[idx + 1] - 100;
			
			if (prev < next)System.out.println(dp[idx]);
			else System.out.println(dp[idx + 1]);
		} else {
			System.out.println(dp[idx]);
		}
    }
}