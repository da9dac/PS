import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");

		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		int max = 0;

		int[][] dp = new int[n][m];
		int[] dx = {-1, -1, 0};
		int[] dy = {-1, 0, -1};

		for (int i = 0; i < n; i++) {
			input = br.readLine().split("");
			for (int j = 0; j < m; j++) {
				if (Integer.parseInt(input[j]) != 1) continue;

				int min = Integer.MAX_VALUE;

				for (int dir = 0; dir < 3; dir++) {
					int x = i + dx[dir];
					int y = j + dy[dir];

					if (x < 0 || y < 0) {
						min = 0;
						break;
					}

					min = Math.min(min, dp[x][y]);
				}

				dp[i][j] = min + 1;
				max = Math.max(max, dp[i][j]);
			}
		}

		System.out.println(max * max);
	}
}