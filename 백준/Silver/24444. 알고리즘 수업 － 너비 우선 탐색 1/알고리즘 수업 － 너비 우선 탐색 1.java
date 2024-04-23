import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int cnt = 1;

		int[] isVisited = new int[n + 1];
		ArrayList<ArrayList<Integer>> near = new ArrayList<>();

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
			Collections.sort(list);
		}

		Queue<Integer> q = new LinkedList<>();

		q.offer(r);
		isVisited[r] = cnt++;

		while (!q.isEmpty()) {
			int cur = q.poll();

			for (int next : near.get(cur)) {
				if (isVisited[next] != 0) continue;

				isVisited[next] = cnt++;
				q.offer(next);
			}
		}

		for (int i = 1; i <= n; i++) {
			sb.append(isVisited[i]).append("\n");
		}

		System.out.println(sb);
	}
}