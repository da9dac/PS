import java.io.*;
import java.util.*;

public class Main {

	static int cnt, n;
	static boolean[] isVisited;
	static ArrayList<ArrayList<Integer>> near;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			cnt = 0;

			n = Integer.parseInt(br.readLine());
			near = new ArrayList<>();
			isVisited = new boolean[n + 1];

			st = new StringTokenizer(br.readLine());

			for (int i = 0; i <= n; i++) {
				near.add(new ArrayList<>());
			}

			for (int i = 1; i <= n; i++) {
				near.get(i).add(Integer.parseInt(st.nextToken()));
			}

			for (int i = 1; i <= n; i++) {
				if (isVisited[i]) continue;
				if (dfs(i)) cnt++;
			}

			sb.append(cnt).append("\n");
		}

		System.out.println(sb);
	}

	static boolean dfs(int cur) {
		isVisited[cur] = true;

		for (int next : near.get(cur)) {
			if (isVisited[next]) return true;
			isVisited[next] = true;
			if (dfs(next)) return true;
		}

		return false;
	}
}