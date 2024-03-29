import java.io.*;
import java.util.*;

class Main {
    
    static int n, m, max = 0, total;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int[][] map;
	static boolean[][] isVisited;
	static Queue<Pair> q = new ArrayDeque<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		total = n * m;

		map = new int[n][m];
		isVisited = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		solve(0);

		System.out.println(max);
	}

	static void solve(int wall) {
		if (wall == 3) {
			bfs();
			return;
		}

		for (int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if (map[i][j] != 0) continue;
				map[i][j] = 1;
				solve(wall + 1);
				map[i][j] = 0;
			}
		}
	}

	static void bfs() {
		int virusAndWalls = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int cur = map[i][j];
				if (cur == 1) {
					virusAndWalls++;
					continue;
				}

				if (cur == 2) {
					isVisited[i][j] = true;
					virusAndWalls++;
					q.offer(new Pair(i, j));
				}
			}
		}

		while (!q.isEmpty()) {
			Pair cur = q.poll();

			for (int dir = 0; dir < 4; dir++) {
				int x = cur.x + dx[dir];
				int y = cur.y + dy[dir];

				if(x < 0 || x >= n || y < 0 || y >= m) continue;
				if(isVisited[x][y] || map[x][y] != 0) continue;

				isVisited[x][y] = true;
				virusAndWalls++;
				q.offer(new Pair(x, y));
			}
		}

		for (int i = 0; i < n; i++) {
			Arrays.fill(isVisited[i], false);
		}

		max = Math.max(max, total - virusAndWalls);
	}

	static class Pair {
		int x, y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}