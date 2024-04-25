import java.io.*;

public class Main {

	static int r, c, max = 0;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static char[][] map;
	static boolean[][] visited;
	static boolean[] used = new boolean[26];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");

		r = Integer.parseInt(input[0]);
		c = Integer.parseInt(input[1]);

		map = new char[r][c];
		visited = new boolean[r][c];

		for (int i = 0; i < r; i++) {
			input = br.readLine().split("");
			for (int j = 0; j < c; j++) {
				map[i][j] = input[j].charAt(0);
			}
		}

		visited[0][0] = true;
		used[map[0][0] - 'A'] = true;

		solve(0, 0, 1);

		System.out.println(max);;
	}

	static void solve(int x, int y, int cnt) {
		if (max < cnt) max = cnt;

		for (int dir = 0; dir < 4; dir++) {
			int nx = x + dx[dir];
			int ny = y + dy[dir];

			if (nx < 0 || ny < 0 || nx >= r || ny >= c) continue;
			if (visited[nx][ny]) continue;
			if (used[map[nx][ny] - 'A']) continue;

			visited[nx][ny] = true;
			used[map[nx][ny] - 'A'] = true;

			solve(nx, ny, cnt + 1);

			visited[nx][ny] = false;
			used[map[nx][ny] - 'A'] = false;
		}
	}
}