import java.io.*;
import java.util.*;

class Main {
    
    static int n, m;
	static int min = Integer.MAX_VALUE;
	static int[][] stats;
	static boolean[] isUsed;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		m = n/2;

		stats = new int[n][n];
		isUsed = new boolean[n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < n; j++) {
				stats[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		solve(0, 0);

		System.out.println(min);
	}

	static void solve(int s, int start) {
		if (s == m) {
			calculate();
			return;
		}

		for (int i = start; i < n; i++) {
			if (isUsed[i]) continue;
			if (s == 0 && i > 0) break;
			isUsed[i] = true;
			solve(s + 1, i + 1);
			isUsed[i] = false;
		}
	}

	static void calculate() {
		int start = 0;
		int link = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				if (isUsed[i] == isUsed[j]) {
					if (isUsed[i]) {
						start += (stats[i][j] + stats[j][i]);
					} else {
						link += (stats[i][j] + stats[j][i]);
					}
				}
			}
		}

		min = Math.min(min, Math.abs(start - link));
	}
}