import java.io.*;
import java.util.*;

public class Main {

	static int n, m, min = Integer.MAX_VALUE, home = 0;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int[][] map;
	static int[][] visited;
	static Poison[] poisons = new Poison[2];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nm = br.readLine().split(" ");

		n = Integer.parseInt(nm[0]);
		m = Integer.parseInt(nm[1]);

		map = new int[n][m];
		visited = new int[n][m];

		for (int i = 0; i < n; i++) {
			char[] line = br.readLine().toCharArray();

			for (int j = 0; j < m; j++) {
				map[i][j] = line[j] - '0';
				if (map[i][j] == 1) home++;
			}
		}

		solve(0, 0, 0);

		System.out.println(min);
	}

	static void solve(int x, int y, int cnt) {
		if (cnt == 2) {
			initVisited();
			bfs();
			return;
		}

		for (int i = x; i < n; i++) {
			for (int j = y; j < m; j++) {
				if(map[i][j] != 0) continue;
				map[i][j] = 2;
				poisons[cnt] = new Poison(i, j);
				solve(i, j, cnt + 1);
				map[i][j] = 0;
			}
		}
	}

	static void bfs() {
		Queue<Poison> q = new ArrayDeque<>();

		Poison a = poisons[0];
		Poison b = poisons[1];

		q.offer(a);
		q.offer(b);

		visited[a.x][a.y] = 0;
		visited[b.x][b.y] = 0;

		int cnt = home;

		while (!q.isEmpty()) {
			Poison cur = q.poll();
			int v = visited[cur.x][cur.y];

			for (int dir = 0 ; dir < 4; dir++) {
				int nx = cur.x + dx[dir];
				int ny = cur.y + dy[dir];

				if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
				if (visited[nx][ny] != -1) continue;

				if (map[nx][ny] == 1) cnt--;
				if (cnt == 0) {
					min = Math.min(min, v + 1);
					return;
				}

				visited[nx][ny] = v + 1;
				q.offer(new Poison(nx, ny));
			}
		}
	}

	static void initVisited() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				visited[i][j] = -1;
			}
		}
	}

	static class Poison {
		int x, y;

		Poison(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}