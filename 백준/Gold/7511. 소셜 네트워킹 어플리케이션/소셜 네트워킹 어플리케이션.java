import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] parents;
	static final String text = "Scenario ";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int t = Integer.parseInt(br.readLine());
		int cnt = 1;

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int k = Integer.parseInt(br.readLine());

			parents = new int[n];

			for (int i = 0; i < n; i++) {
				parents[i] = i;
			}

			for (int i = 0; i < k; i++) {
				st = new StringTokenizer(br.readLine());

				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());

				union(a, b);
			}

			sb.append(text).append(cnt++).append(":").append("\n");

			int m = Integer.parseInt(br.readLine());

			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());

				int u = Integer.parseInt(st.nextToken());
				int v = Integer.parseInt(st.nextToken());

				sb.append(isCycle(u, v) ? 1 : 0).append("\n");
			}

			sb.append("\n");
		}

		System.out.println(sb);
	}

	static void union(int a, int b) {
		a = find(a);
		b = find(b);

		if (a == b) return;

		if (a < b) {
			parents[b] = a;
		} else {
			parents[a] = b;
		}
	}
	
	static boolean isCycle(int a, int b) {		
		return find(a) == find(b);
	}

	static int find(int n) {
		return parents[n] == n ? n : find(parents[n]);
	}
}