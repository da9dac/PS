import java.io.*;
import java.util.*;

public class Main {
    
	static int[] parents;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		parents = new int[n];

		for (int i = 0; i < n; i++) {
			parents[i] = i;
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			if (union(a, b)) {
				System.out.println(i + 1);
				return;
			}
		}

		System.out.println(0);
	}

	static boolean union(int a, int b) {
		int x = find(a);
		int y = find(b);

		if (x == y) return true;

		if (x < y) parents[y] = x;
		else parents[x] = y;

		return false;
	}

	static int find(int cur) {
		return parents[cur] == cur ? cur : find(parents[cur]);
	}
}