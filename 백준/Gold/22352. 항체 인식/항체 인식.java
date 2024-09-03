import java.io.*;
import java.util.*;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int n, m;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int[][] mapA, mapB;
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		mapA = init();
		mapB = init();
		visited = new boolean[n][m];

		System.out.println(solve() ? "YES" : "NO");
	}

	static boolean solve() {
		Queue<Pair> q = new LinkedList<>();
		Queue<Pair> q2 = new LinkedList<>();

		int cnt = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (visited[i][j]) continue;

				int num = mapA[i][j];

				q.offer(new Pair(i, j));
				visited[i][j] = true;

				while (!q.isEmpty()) {
					Pair cur = q.poll();

					for (int dir = 0; dir < 4; dir++) {
						int nx = cur.x + dx[dir];
						int ny = cur.y + dy[dir];

						if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
						if (visited[nx][ny]) continue;
						if (mapA[nx][ny] != num) continue;

						q.offer(new Pair(nx, ny));
						q2.offer(new Pair(nx, ny));
						visited[nx][ny] = true;
					}
				}

				int num2 = mapB[i][j];

				while (!q2.isEmpty()) {
					Pair cur = q2.poll();

					if (mapB[cur.x][cur.y] != num2) return false;
				}

				if (num != num2) cnt++;
			}
		}

		return cnt <= 1;
	}

	static int[][] init() throws IOException {
		int[][] map = new int[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		return map;
	}

	static class Pair {
		int x, y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}