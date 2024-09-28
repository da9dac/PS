import java.io.*;
import java.util.*;

class Main {
    static int[] parents;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		parents = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			parents[i] = i;
		}

		for (int a = 0; a < m; a++) {
			st = new StringTokenizer(br.readLine());

			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());

			union(i, j);
		}

		st = new StringTokenizer(br.readLine());

		int cur = 0;
		int cnt = -1;

		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(st.nextToken());
			int y = find(x);

			if (y != cur) {
				cur = y;
				cnt++;
			}
		}

		System.out.println(cnt);
	}

	static void union(int x, int y) {
		x = find(x);
		y = find(y);

		if (x == y) return;

		if (x < y) {
			parents[y] = x;
		} else {
			parents[x] = y;
		}
	}

	static int find(int cur) {
		return parents[cur] == cur ? cur : find(parents[cur]);
	}
}