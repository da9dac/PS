import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
		int result = 1;
		int[] dp = new int[n];
		int[] arr = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(st.nextToken());
			dp[i] = 1;
			arr[i] = x;

			for (int j = 0; j < i; j++) {
				if (arr[j] < x) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}

			result = Math.max(result, dp[i]);
		}

		System.out.println(result);
    }
}