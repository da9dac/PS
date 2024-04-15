import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);

		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		int[][] map = new int[n][m];
		int[][] isVisited = new int[n][m];
		Queue<Pair> q = new ArrayDeque<>();

		for (int i = 0; i < n; i++) {
			input = br.readLine().split("");
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(input[j]) * -1;
			}
		}

		Map<Integer, Integer> counts = new HashMap<>();
		int num = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == -1) continue;
				if (isVisited[i][j] != 0) continue;

				int cnt = 1;
				q.offer(new Pair(i, j));
				isVisited[i][j] = num;

				while (!q.isEmpty()) {
					Pair cur = q.poll();

					for (int dir = 0; dir < 4; dir++) {
						int nx = cur.x + dx[dir];
						int ny = cur.y + dy[dir];

						if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
						if (isVisited[nx][ny] != 0 || map[nx][ny] == -1) continue;

						cnt++;
						isVisited[nx][ny] = num;
						q.offer(new Pair(nx, ny));
					}
				}

				counts.put(num++, cnt);
			}
		}

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == 0) {
					sb.append(0);
					continue;
				}

				int cnt = 1;

				for (int dir = 0; dir < 4; dir++) {
					int nx = i + dx[dir];
					int ny = j + dy[dir];

					if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
					if (map[nx][ny] == -1) continue;

					set.add(isVisited[nx][ny]);
				}

				for (int c : set) cnt += counts.get(c);
				set.clear();

				sb.append(cnt % 10);
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}

	static class Pair {
		int x, y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}