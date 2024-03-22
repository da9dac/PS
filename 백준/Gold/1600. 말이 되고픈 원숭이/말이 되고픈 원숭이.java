import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[] hx = {2, 2, 1, 1, -1, -1, -2, -2};
		int[] hy = {1, -1, 2, -2, 2, -2, 1, -1};

		int[] mx = {-1, 1, 0, 0};
		int[] my = {0, 0, -1, 1};

		int k = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		int[][] zoo = new int[h][w];
		boolean[][][] isVisited = new boolean[h][w][k + 1];

		int targetX = h - 1;
		int targetY = w - 1;

		for (int i = 0; i < h; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < w; j++) {
				zoo[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		Queue<Monkey> monkeys = new LinkedList<>();
		monkeys.offer(new Monkey(0, 0, 0, 0));
		isVisited[0][0][0] = true;

		int min = Integer.MAX_VALUE;

		while (!monkeys.isEmpty()) {
			Monkey cur = monkeys.poll();

			int cx = cur.x;
			int cy = cur.y;
			int ch = cur.horse;
			int cm = cur.move;

			if (cx == targetX && cy == targetY) {
				min = cm;
				break;
			}

			if (ch < k) {
				for (int dir = 0; dir < 8; dir++) {
					int x = cx + hx[dir];
					int y = cy + hy[dir];

					if (x < 0 || x >= h || y < 0 || y >= w) continue;
					if (isVisited[x][y][ch + 1] || zoo[x][y] == 1) continue;

					isVisited[x][y][ch + 1] = true;
					monkeys.offer(new Monkey(x, y, ch + 1, cm + 1));
				}
			}

			for (int dir = 0; dir < 4; dir++) {
				int x = cx + mx[dir];
				int y = cy + my[dir];

				if (x < 0 || x >= h || y < 0 || y >= w) continue;
				if (isVisited[x][y][ch] || zoo[x][y] == 1) continue;

				isVisited[x][y][ch] = true;
				monkeys.offer(new Monkey(x, y, ch, cm + 1));
			}
		}

		if (min == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(min);
		}
	}

	private static class Monkey {
		int x;
		int y;
		int horse;
		int move;

		public Monkey(int x, int y, int horse, int move) {
			this.x = x;
			this.y = y;
			this.horse = horse;
			this.move = move;
		}
	}
}
