import java.io.*;
import java.util.*;

public class Main {

	static int n, m;
	static ArrayList<Integer>[] near;
	static int[] parent;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());

		near = new ArrayList[n + 1];
		parent = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			parent[i] = i;
			near[i] = new ArrayList<>();
		}

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j = 1; j <= n; j++) {
				if (Integer.parseInt(st.nextToken()) == 0) continue;
				near[j].add(i);
				near[i].add(j);
			}
		}

		for (int i = 1; i <= n; i++) {
			for (int next : near[i]) {
				union(i, next);
			}
		}

		st = new StringTokenizer(br.readLine());
		int x = find(Integer.parseInt(st.nextToken()));

		for (int i = 1; i < m; i++) {
			if (find(Integer.parseInt(st.nextToken())) != x) {
				System.out.println("NO");
				return;
			}
		}

		System.out.println("YES");
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