import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		Map<String, ArrayList<String>> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			String key = st.nextToken();
			st.nextToken();
			String value = st.nextToken();

			ArrayList<String> list = map.getOrDefault(key, new ArrayList<>());
			list.add(value);

			map.put(key, list);
		}

		Map<String, Boolean> isVisited = new HashMap<>();
		Queue<String> q = new ArrayDeque<>();
		q.offer("Baba");
		isVisited.put("Baba", true);

		PriorityQueue<String> pq = new PriorityQueue<>();

		while (!q.isEmpty()) {
			String s = q.poll();

			for (String next : map.getOrDefault(s, new ArrayList<>())) {
				if (isVisited.getOrDefault(next, false)) continue;
				isVisited.put(next, true);
				q.offer(next);
				pq.offer(next);
			}
		}

		while (!pq.isEmpty()) {
			sb.append(pq.poll()).append("\n");
		}

		System.out.println(sb);
	}
}