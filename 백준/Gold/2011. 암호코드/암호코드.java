import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String secret = br.readLine();

		if (secret.charAt(0) == '0') {
			System.out.println(0);
			return;
		}

		int len = secret.length();
		long[] dp = new long[len + 1];

		dp[0] = 1;
		dp[1] = 1;

		for (int i = 2; i <= len; i++) {
			int x = Integer.parseInt(secret.substring(i - 2, i));

			if (x == 0) {
				System.out.println(0);
				return;
			}

			if (i == len && x % 10 == 0 && x > 26) {
				System.out.println(0);
				return;
			}
            
            if (x > 26 && x % 10 == 0) {
				System.out.println(0);
				return;
			}

			if (x > 26 || x < 10) {
				dp[i] = dp[i-1];
			} else if (x % 10 == 0) {
				dp[i] = dp[i-2];
			} else {
				dp[i] = (dp[i-1] + dp[i-2]) % 1000000;
			}
		}

		System.out.println(dp[len]);
	}
}