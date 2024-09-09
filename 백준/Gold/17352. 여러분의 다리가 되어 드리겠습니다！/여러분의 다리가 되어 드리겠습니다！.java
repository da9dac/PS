import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	static int[] parents;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		parents = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			parents[i] = i;
		}

		for (int i = 0; i < n - 2; i++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			union(a, b);
		}

		for (int i = 2; i <= n; i++) {
			if (!union(1, i)) {
				System.out.println(1 + " " + i);
				return;
			}
		}
	}

	static boolean union(int a, int b) {
		a = find(a);
		b = find(b);

		if (a == b) return true;

		if (a < b) {
			parents[b] = a;
		} else {
			parents[a] = b;
		}

		return false;
	}

	static int find(int n) {
		return parents[n] == n ? n : find(parents[n]);
	}
}