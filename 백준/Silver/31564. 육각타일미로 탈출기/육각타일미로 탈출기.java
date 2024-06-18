import java.io.*;
import java.util.*;

public class Main {

	static int n, m;
	static int[] dx = {-1, -1, 0, 0, 1, 1};
	static int[] uy = {-1, 0, -1, 1, -1, 0};
	static int[] dy = {0, 1, -1, 1, 0, 1};
	static int[][] maze;
	static Queue<Pair> q = new ArrayDeque<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		maze = new int[n][m];

		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());

			int y = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());

			maze[y][x] = -1;
		}

		q.offer(new Pair(0, 0));
		maze[0][0] = 1;

		while (!q.isEmpty()) {
			Pair p = q.poll();
			int x = p.x, y = p.y;
			int next = maze[x][y] + 1;

			if (x % 2 == 0) {
				for (int dir = 0; dir < 6; dir++) {
					int nx = x + dx[dir];
					int ny = y + uy[dir];

					if (nx == n - 1 && ny == m - 1) {
						System.out.println(next - 1);
						return;
					}
					if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
					if (maze[nx][ny] != 0) continue;

					q.offer(new Pair(nx, ny));
					maze[nx][ny] = next;
				}
			} else {
				for (int dir = 0; dir < 6; dir++) {
					int nx = x + dx[dir];
					int ny = y + dy[dir];

					if (nx == n - 1 && ny == m - 1) {
						System.out.println(next - 1);
						return;
					}
					if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
					if (maze[nx][ny] != 0) continue;

					q.offer(new Pair(nx, ny));
					maze[nx][ny] = next;
				}
			}
		}

		System.out.println(-1);
	}

	static class Pair {
		int x, y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}