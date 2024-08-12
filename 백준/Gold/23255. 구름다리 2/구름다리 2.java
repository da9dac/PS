import java.io.*;
import java.util.*;

public class Main {

	static int n, m;
	static int[] visited;
	static ArrayList<Integer>[] near;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		visited = new int[n + 1];
		near = new ArrayList[n + 1];

		for (int i = 1; i <= n; i++) {
			near[i] = new ArrayList<>();
		}

		while (m-- > 0) {
			st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			near[x].add(y);
			near[y].add(x);
		}

		for (int i = 1; i <= n; i++) {
			Collections.sort(near[i]);
		}

		for (int i = 1; i <= n; i++) {
			int x = 1;

			Set<Integer> colors = new TreeSet<>();

			for (int next : near[i]) {
				if (visited[next] != 0) colors.add(visited[next]);
			}

			for (int color : colors) {
				if (color != x) break;
				x++;
			}

			visited[i] = x;
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= n; i++) {
			sb.append(visited[i]).append(" ");
		}

		System.out.println(sb);
	}
}