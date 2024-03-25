import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int l, r, c;
		String[] input;
		char[] chars;
		boolean[][][] isVisited;
		char[][][] building;
		int[] dl = {0, 0, 0, 0, 1, -1};
		int[] dr = {0, 0, 1, -1, 0, 0};
		int[] dc = {1, -1, 0, 0, 0, 0};

		while (true) {
			input = br.readLine().split(" ");

			l = Integer.parseInt(input[0]);
			r = Integer.parseInt(input[1]);
			c = Integer.parseInt(input[2]);
			boolean isEscaped = false;

			if (l == 0 && r == 0 && c == 0) break;

			building = new char[l][r][c];
			isVisited = new boolean[l][r][c];

			Queue<Me> q = new ArrayDeque<>();

			for (int i = 0; i < l; i++) {
				for (int j = 0; j < r; j++) {
					chars = br.readLine().toCharArray();
					for (int k = 0; k < c; k++) {
						if (chars[k] == 'S') q.offer(new Me(i, j, k, 0));
						building[i][j][k] = chars[k];
					}
				}
				br.readLine();
			}

			while (!q.isEmpty()) {
				Me cur = q.poll();

				for (int dir = 0; dir < 6; dir++) {
					int nl = cur.l + dl[dir];
					int nr = cur.r + dr[dir];
					int nc = cur.c + dc[dir];

					if (nl < 0 || nl >= l || nr < 0 || nr >= r || nc < 0 || nc >= c) continue;
					if (isVisited[nl][nr][nc] || building[nl][nr][nc] == '#') continue;

					if (building[nl][nr][nc] == 'E') {
						isEscaped = true;
						sb.append("Escaped in ").append(cur.move + 1).append(" minute(s).").append("\n");
						break;
					}

					isVisited[nl][nr][nc] = true;
					q.offer(new Me(nl, nr, nc, cur.move + 1));
				}

				if (isEscaped) break;
			}

			if (!isEscaped) sb.append("Trapped!").append("\n");
		}

		System.out.println(sb);
	}

	static class Me {
		int l, r, c, move;

		public Me(int l, int r, int c, int move) {
			this.l = l;
			this.r = r;
			this.c = c;
			this.move = move;
		}
	}
}