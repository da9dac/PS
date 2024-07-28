import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int k = Integer.parseInt(st.nextToken());

		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		int[][] map = new int[n][m];
		boolean[][] visited = new boolean[n][m];

		while (k-- > 0) {
			st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken()) - 1;
			int y = Integer.parseInt(st.nextToken()) - 1;

			map[x][y] = 1;
		}

		st = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(st.nextToken()) - 1;
		int y = Integer.parseInt(st.nextToken()) - 1;

		visited[x][y] = true;
		Unit Start = new Unit(x, y, 0);

		st = new StringTokenizer(br.readLine());

		x = Integer.parseInt(st.nextToken()) - 1;
		y = Integer.parseInt(st.nextToken()) - 1;

		Queue<Unit> queue = new ArrayDeque<>();
		queue.offer(Start);

		while (!queue.isEmpty()) {
			Unit u = queue.poll();

			for (int dir = 0; dir < 4; dir++) {
				int nx = u.x + dx[dir];
				int ny = u.y + dy[dir];

				if (nx < 0 || nx >= n || ny < 0 || ny >= m || visited[nx][ny]) continue;

				int ex = nx + a - 1;
				int ey = ny + b - 1;

				if (ex < 0 || ex >= n || ey < 0 || ey >= m) continue;

				boolean possible = true;

				out:
				for (int i = nx; i <= ex; i++) {
					for (int j = ny; j <= ey; j++) {
						if (map[i][j] == 1) {
							possible = false;
							break out;
						}
					}
				}

				if (!possible) continue;

				if (nx == x && ny == y) {
					System.out.println(u.day + 1);
					return;
				}

				visited[nx][ny] = true;
				queue.offer(new Unit(nx, ny, u.day + 1));
			}
		}

		System.out.println(-1);
	}

	static class Unit {
		int x, y, day;
		public Unit(int x, int y, int day) {
			this.x = x;
			this.y = y;
			this.day = day;
		}
	}
}