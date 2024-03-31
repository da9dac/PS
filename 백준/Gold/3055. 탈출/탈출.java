import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");

		int r = Integer.parseInt(input[0]);
		int c = Integer.parseInt(input[1]);

		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};

		char[][] map = new char[r][c];

		Queue<Pair> wq = new ArrayDeque<>();
		Queue<Pair> hq = new ArrayDeque<>();

		int[][] water = new int[r][c];
		int[][] hog = new int[r][c];

		for (int i = 0; i < r; i++) {
			String s = br.readLine();
			for (int j = 0; j < c; j++) {
				water[i][j] = -1;
				hog[i][j] = -1;

				map[i][j] = s.charAt(j);

				if (map[i][j] == '*') {
					wq.offer(new Pair(i, j, 0));
					water[i][j] = 0;
				}

				if (map[i][j] == 'S') {
					hq.offer(new Pair(i, j, 0));
					hog[i][j] = 0;
				}
			}
		}

		while (!wq.isEmpty()) {
			Pair cur = wq.poll();

			for (int dir = 0; dir < 4; dir++) {
				int x = cur.x + dx[dir];
				int y = cur.y + dy[dir];

				if (x < 0 || x >= r || y < 0 || y >= c) continue;
				if (map[x][y] == 'X' || map[x][y] == 'D' || water[x][y] != -1) continue;

				water[x][y] = cur.move + 1;
				wq.offer(new Pair(x, y, cur.move + 1));
			}
		}

		while (!hq.isEmpty()) {
			Pair cur = hq.poll();
			int next = cur.move + 1;

			for (int dir = 0; dir < 4; dir++) {
				int x = cur.x + dx[dir];
				int y = cur.y + dy[dir];

				if (x < 0 || x >= r || y < 0 || y >= c) continue;
				if (map[x][y] == 'X' || map[x][y] == '*' || hog[x][y] != -1) continue;
				if (map[x][y] == 'D') {
					System.out.println(next);
					return;
				}
				if (water[x][y] != -1 && water[x][y] <= next) continue;

				hog[x][y] = next;
				hq.offer(new Pair(x, y, next));
			}
		}

		System.out.println("KAKTUS");
	}

	static class Pair {
		int x, y, move;

		public Pair(int x, int y, int move) {
			this.x = x;
			this.y = y;
			this.move = move;
		}
	}
}