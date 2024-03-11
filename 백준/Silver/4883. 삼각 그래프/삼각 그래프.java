import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int[] dx = {0, 1, 1, 1};
		int[] dy = {1, -1, 0, 1};
		int tc = 1;

		while (true) {
			int n = Integer.parseInt(br.readLine());

			if (n == 0) break;

			int[][] arr = new int[n][3];
			int[][] dp = new int[n][3];
			boolean[][] isVisited = new boolean[n][3];

			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());

				for (int j = 0; j < 3; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			dp[0][1] = arr[0][1];
			isVisited[0][1] = true;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 3; j++) {
					if (i == 0 && j == 0) continue;
					if (i == n - 1 && j == 1) {
						sb.append(tc++).append(". ").append(dp[i][j]).append("\n");
						break;
					}

					for (int dir = 0; dir < 4; dir++) {
						int x = i + dx[dir];
						int y = j + dy[dir];

						if (y < 0 || x >= n || y >= 3) continue;

						if (isVisited[x][y]) {
							dp[x][y] = Math.min(dp[x][y], dp[i][j] + arr[x][y]);
						} else {
							isVisited[x][y] = true;
							dp[x][y] = dp[i][j] + arr[x][y];
						}
					}
				}
			}
		}

		System.out.println(sb);
	}
}