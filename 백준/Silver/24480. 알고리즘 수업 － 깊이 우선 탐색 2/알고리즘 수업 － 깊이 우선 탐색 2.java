import java.io.*;
import java.util.*;

public class Main {

	static int n, m, r, cnt = 1;
	static int[] isVisited;
	static ArrayList<ArrayList<Integer>> near = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());

		isVisited = new int[n + 1];

		for (int i = 0; i <= n; i++) {
			near.add(new ArrayList<>());
		}

		while (m-- > 0) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			near.get(a).add(b);
			near.get(b).add(a);
		}

		for (ArrayList<Integer> list : near) {
			list.sort(Collections.reverseOrder());
		}

		dfs(r);

		for (int i = 1; i <= n; i++) {
			sb.append(isVisited[i]).append("\n");
		}

		System.out.println(sb);
	}

	static void dfs(int cur) {
		isVisited[cur] = cnt++;

		for (int next : near.get(cur)) {
			if (isVisited[next] != 0) continue;
			dfs(next);
		}
	}
}