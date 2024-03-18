import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] seq = new int[n + 1];
		boolean[][] dp = new boolean[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
			dp[i][i] = true;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
				if (isPalindrome(seq, i, j)) dp[i][j] = true;
			}
		}

		int m = Integer.parseInt(br.readLine());

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			sb.append(dp[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] ? 1 : 0).append("\n");
		}

		System.out.println(sb);
	}

	static boolean isPalindrome(int[] seq, int s, int e) {
		while (s < e) {
			if (seq[s++] != seq[e--]) return false;
		}

		return true;
	}
}