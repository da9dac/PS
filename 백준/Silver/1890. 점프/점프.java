import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		long[][] dp = new long[n][n];
		dp[0][0] = 1;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < n; j++) {
				int x = Integer.parseInt(st.nextToken());
				if (dp[i][j] == 0 || x == 0) continue;
				if (i + x < n) dp[i + x][j] += dp[i][j];
				if (j + x < n) dp[i][j + x] += dp[i][j];
			}
		}

		System.out.println(dp[n - 1][n - 1]);
	}
}