import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
        long sum = 0;

		if (n == 1) {
			System.out.println(10);
			return;
		}

		long[][] dp = new long[n + 1][10];

		for (int i = 0; i < 10; i++) {
			dp[1][i] = 1;
		}

		for (int i = 2; i <= n; i++) {
			dp[i][9] = 1;
			for (int j = 8; j >= 0; j--) {
				dp[i][j] = (dp[i][j + 1] + dp[i - 1][j]) % 10007;
			}
		}

		for (int i = 0; i < 10; i++) {
			sum += dp[n][i];
		}

		System.out.println(sum % 10007);
	}
}