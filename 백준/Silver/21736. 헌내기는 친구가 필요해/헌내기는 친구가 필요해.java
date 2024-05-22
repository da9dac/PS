import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strs = br.readLine().split(" ");

		int n = Integer.parseInt(strs[0]);
		int m = Integer.parseInt(strs[1]);
		int cnt = 0;

		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};

		char[][] map = new char[n][m];
		boolean[][] isVisited = new boolean[n][m];
		Queue<int[]> q = new ArrayDeque<>();

		for (int i = 0; i < n; i++) {
			map[i] = br.readLine().toCharArray();

			for (int j = 0; j < m; j++) {
				if (map[i][j] == 'I') {
					q.offer(new int[]{i, j});
					isVisited[i][j] = true;
				}
			}
		}

		while (!q.isEmpty()) {
			int[] cur = q.poll();

			for (int dir = 0; dir < 4; dir++) {
				int nx = cur[0] + dx[dir];
				int ny = cur[1] + dy[dir];

				if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
				if (isVisited[nx][ny] || map[nx][ny] == 'X') continue;

				if (map[nx][ny] == 'P') cnt++;
				isVisited[nx][ny] = true;
				q.offer(new int[]{nx, ny});
			}
		}

		System.out.println(cnt == 0 ? "TT" : cnt);
	}
}