import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] map = new int[m][n];
		boolean[][] visited = new boolean[m][n];
        
        if (n == 1 && m == 1) {
			System.out.println("Yes");
			return;
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int[] dx = {0, 1};
		int[] dy = {1, 0};

		Queue<int[]> q = new LinkedList<>();
		q.add(new int[]{0, 0});
		visited[0][0] = true;

		while (!q.isEmpty()) {
			int[] cur = q.poll();

			for (int dir = 0; dir < 2; dir++) {
				int x = cur[0] + dx[dir];
				int y = cur[1] + dy[dir];

				if (x >= m || y >= n || visited[x][y] || map[x][y] == 0) continue;
				if (x == m - 1 && y == n - 1) {
					System.out.println("Yes");
					return;
				}
				visited[x][y] = true;
				q.add(new int[]{x, y});
			}
		}

		System.out.println("No");
	}
}