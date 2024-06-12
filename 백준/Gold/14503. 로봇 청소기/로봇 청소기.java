import java.io.*;
import java.util.*;

public class Main {

	static int n, m, r, c, d, cnt = 0;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] room;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		room = new int[n][m];

		st = new StringTokenizer(br.readLine());

		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				room[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		clean(r, c, d);

		System.out.println(cnt);
	}

	static void clean(int cx, int cy, int dir) {
		if (room[cx][cy] == 0) {
			room[cx][cy] = 2;
			cnt++;
		}

		boolean isNone = true;

		for (int i = 0; i < 4; i++) {
			if (room[cx + dx[i]][cy + dy[i]] == 0) {
				isNone = false;
				break;
			}
		}

		if (isNone) {
			int nx = cx + (dx[dir] * -1);
			int ny = cy + (dy[dir] * -1);

			if (room[nx][ny] != 1) {
				clean(nx, ny, dir);
			}
		} else {
			if (dir == 0) dir = 3;
			else dir--;

			int nx = cx + dx[dir];
			int ny = cy + dy[dir];

			if (room[nx][ny] == 0) clean(nx, ny, dir);
			else clean(cx, cy, dir);
		}
	}
}