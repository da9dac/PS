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
		parent = new int[n + 1];
		boolean isPossible = true;

		for (int i = 1; i <= n; i++) {
			parent[i] = i;
		}

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j = 1; j <= n; j++) {
				if (Integer.parseInt(st.nextToken()) == 0) continue;
				union(i, j);
			}
		}

		st = new StringTokenizer(br.readLine());
		int x = find(Integer.parseInt(st.nextToken()));

		for (int i = 1; i < m; i++) {
			if (find(Integer.parseInt(st.nextToken())) != x) {
				isPossible = false;
				break;
			}
		}

		System.out.println(isPossible ? "YES" : "NO");
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