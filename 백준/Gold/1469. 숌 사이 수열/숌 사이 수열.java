import java.io.*;
import java.util.*;

class Main {
	static int n, len;
	static int[] x, s;
	static boolean[] isUsed;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		len = n * 2;

		x = new int[n];
		s = new int[len];
		isUsed = new boolean[n];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			x[i] = Integer.parseInt(st.nextToken());
			s[i * 2] = -1;
			s[i * 2 + 1] = -1;
		}

		Arrays.sort(x);

		if (solve(0)) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < len; i++) {
				sb.append(s[i]).append(' ');
			}
			System.out.println(sb);
		} else {
			System.out.println(-1);
		}
	}

	static boolean solve(int cur) {
		if (cur == len) {
			return true;
		}

		if (s[cur] != -1) {
			return solve(cur + 1);
		}

		for (int i = 0; i < n; i++) {
			if (isUsed[i]) continue;
			int idx = cur + x[i] + 1;
			if (idx >= len || s[idx] != -1 || s[cur] != -1) continue;

			isUsed[i] = true;
			s[cur] = s[idx] = x[i];

			if (solve(cur + 1)) return true;

			isUsed[i] = false;
			s[cur] = s[idx] = -1;
		}

		return false;
	}
}