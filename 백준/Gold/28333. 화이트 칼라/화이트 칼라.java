import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());
		int n, m;

		List<List<Integer>> near;
		List<List<Integer>> prev;

		int[] dist;
		boolean[] visited;

		Queue<Integer> q;
		Set<Integer> set;

		while(t-- > 0) {
			st = new StringTokenizer(br.readLine());

			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());

			near = new ArrayList<>();
			prev = new ArrayList<>();
			dist = new int[n + 1];
			visited = new boolean[n + 1];
			q = new ArrayDeque<>();

			for (int i = 0; i <= n; i++) {
				near.add(new ArrayList<>());
				prev.add(new ArrayList<>());
			}

			while(m-- > 0) {
				st = new StringTokenizer(br.readLine());

				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());

				near.get(a).add(b);
			}

			q.offer(1);
			dist[1] = 1;

			while (!q.isEmpty()) {
				int cur = q.poll();
				int cnt = dist[cur] + 1;

				for (int next : near.get(cur)) {
					if (dist[next] == 0) {
						dist[next] = cnt;
						q.offer(next);
						prev.get(next).add(cur);
					} else if (dist[next] == cnt) {
						prev.get(next).add(cur);
					}
				}
			}

			set = new TreeSet<>();
			q = new ArrayDeque<>();

			set.add(n);
			q.offer(n);
			visited[n] = true;

			while (!q.isEmpty()) {
				int cur = q.poll();

				for (int p : prev.get(cur)) {
					if (!visited[p]) {
						set.add(p);
						q.offer(p);
						visited[p] = true;
					}
				}
			}

			for (int x : set) sb.append(x).append(" ");
			sb.append("\n");
		}

		System.out.println(sb);
	}
}