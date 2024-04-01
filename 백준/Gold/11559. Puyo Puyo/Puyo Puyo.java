import java.io.*;
import java.util.*;

class Main {
    
    static int max = 0;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static char[][] fields = new char[12][6];
	static boolean[][] isVisited = new boolean[12][6];
	static Queue<Pair> q = new ArrayDeque<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 12; i++) {
			fields[i] = br.readLine().toCharArray();
		}

		solve();

		System.out.println(max);
	}

	static void solve() {
		boolean boom = false;

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 6; j++) {
				if (isVisited[i][j]) continue;
				if (fields[i][j] != '.') {
					boolean b = bfs(i, j, fields[i][j]);
					if (b) boom = true;
				}
			}
		}

		if (boom) {
			max++;
			down();
			solve();
		}
	}

	static void down() {
		for (int start = 0; start < 6; start++) {
			int idx = 11;

			for (int i = 11; i >= 0; i--) {
				isVisited[i][start] = false;
				if (fields[i][start] != '.') {
					char tmp = fields[i][start];
					fields[i][start] = '.';
					fields[idx--][start] = tmp;
				}
			}
		}
	}

	static boolean bfs(int x, int y, char c) {
		Pair curP = new Pair(x, y);
		q.offer(curP);
		isVisited[x][y] = true;

		ArrayList<Pair> list = new ArrayList<>();
		list.add(curP);

		while (!q.isEmpty()) {
			Pair cur = q.poll();

			for (int dir = 0; dir < 4; dir++) {
				int nx = cur.x + dx[dir];
				int ny = cur.y + dy[dir];

				if (nx < 0 || nx >= 12 || ny < 0 || ny >= 6) continue;
				if (fields[nx][ny] != c || isVisited[nx][ny]) continue;

				isVisited[nx][ny] = true;
				Pair next = new Pair(nx, ny);
				list.add(next);
				q.offer(next);
			}
		}

		if(list.size() > 3) {
			for (Pair p : list) fields[p.x][p.y] = '.';
			return true;
		}

		return false;
	}

	static class Pair {
		int x, y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}