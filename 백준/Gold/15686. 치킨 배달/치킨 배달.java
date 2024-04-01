import java.io.*;
import java.util.*;

class Main {
    
    static int n, m, h, c, answer = Integer.MAX_VALUE;
	static ArrayList<Pair> home = new ArrayList<>();
	static ArrayList<Pair> chicken = new ArrayList<>();
	static int[] selects;
	static int[][] distance;
	static boolean[] isUsed;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < n; j++) {
				int x = Integer.parseInt(st.nextToken());

				if (x == 1) home.add(new Pair(i, j));
				if (x == 2) chicken.add(new Pair(i, j));
			}
		}

		c = chicken.size();
		h = home.size();
		isUsed = new boolean[c];
		selects = new int[m];

		calculateDistance();
		solve(0, 0);

		System.out.println(answer);
	}

	static void calculateDistance() {
		distance = new int[h][c];

		for (int i = 0; i < h; i++) {
			Pair cur = home.get(i);
			for (int j = 0; j < c; j++) {
				Pair tar = chicken.get(j);
				distance[i][j] = Math.abs(cur.x - tar.x) + Math.abs(cur.y - tar.y);
			}
		}
	}

	static void solve(int start, int size) {
		if (size == m) {
			calculateSum();
			return;
		}

		for (int i = start; i < c; i++) {
			if (isUsed[i]) continue;
			isUsed[i] = true;
			selects[size] = i;
			solve(i + 1, size + 1);
			isUsed[i] = false;
		}
	}

	static void calculateSum() {
		int sum = 0;

		for (int i = 0; i < h; i++) {
			int min = Integer.MAX_VALUE;

			for (int j = 0; j < m; j++) {
				min = Math.min(min, distance[i][selects[j]]);
			}

			sum += min;
		}

		answer = Math.min(answer, sum);
	}

	static class Pair {
		int x, y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}