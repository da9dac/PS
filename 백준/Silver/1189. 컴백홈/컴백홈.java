import java.io.*;
import java.util.*;

class Main {
    
    static int r, c, k, max = 0;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static char[][] map;
	static boolean[][] isVisited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		map = new char[r][c];
		isVisited = new boolean[r][c];

		for (int i = 0; i < r; i++) {
			String s = br.readLine();
			for (int j = 0; j < c; j++) {
				map[i][j] = s.charAt(j);
			}
		}

		isVisited[r-1][0] = true;
		solve(r - 1, 0, 1);

		System.out.println(max);
	}

	static void solve(int x, int y, int move) {
		if (x == 0 && y == c - 1) {
			if (move == k) max++;
			return;
		}

		if (move >= k) return;

		for (int dir = 0; dir < 4; dir++) {
			int nx = x + dx[dir];
			int ny = y + dy[dir];

			if (nx < 0 || ny < 0 || nx >= r || ny >= c) continue;
			if (isVisited[nx][ny] || map[nx][ny] == 'T') continue;

			isVisited[nx][ny] = true;
			solve(nx, ny, move + 1);
			isVisited[nx][ny] = false;
		}
	}
}