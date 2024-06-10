import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int max = 0;

		Subject[] subjects = new Subject[k + 1];
		int[][] dp = new int[k + 1][n + 1];

		for (int i = 1; i <= k; i++) {
			st = new StringTokenizer(br.readLine());
			subjects[i] = new Subject(st.nextToken(), st.nextToken());
		}

		for (int i = 1; i <= k; i++) {
			for (int j = 0; j <= n; j++) {
				if (subjects[i].time > j) dp[i][j] = dp[i - 1][j];
				else dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - subjects[i].time] + subjects[i].imp);

				max = Math.max(max, dp[i][j]);
			}
		}

		System.out.println(max);
	}

	static class Subject {
		int imp, time;

		public Subject(String imp, String time) {
			this.imp = Integer.parseInt(imp);
			this.time = Integer.parseInt(time);
		}
	}
}