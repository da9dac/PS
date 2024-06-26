import java.io.*;
import java.util.*;

public class Main {

	static int cur;
	static int[] parent;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		parent = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			parent[i] = i;
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			if (x == 0) union(a, b);
			else {
				sb.append(find(a) == find(b) ? "YES" : "NO").append("\n");
			}
		}

		System.out.println(sb);
	}

	static void union(int x, int y) {
		x = find(x);
		y = find(y);

		if (x != y) parent[y] = x;
	}

	static int find(int x) {
		if (parent[x] == x) return x;
		return parent[x] = find(parent[x]);
	}
}