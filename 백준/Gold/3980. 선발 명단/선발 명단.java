import java.io.*;
import java.util.*;

class Main {
    
    static int max = 0;
	static boolean[] isUsed = new boolean[11];
	static int[][] stats = new int[11][11];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int c = Integer.parseInt(br.readLine());

		while (c-- > 0) {
			max = 0;

			for (int i = 0; i < 11; i++) {
				st = new StringTokenizer(br.readLine());

				for (int j = 0; j < 11; j++) {
					stats[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			solve(0, 0);

			sb.append(max).append("\n");
		}


		System.out.println(sb);
	}

	static void solve(int size, int sum) {
		if (size == 11) {
			max = Math.max(max, sum);
			return;
		}

		for (int i = 0; i < 11; i++) {
			if (isUsed[i]) continue;
            if (stats[i][size] == 0) continue;

			isUsed[i] = true;
			solve(size + 1, sum + stats[i][size]);
			isUsed[i] = false;
		}
	}
}