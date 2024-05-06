import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String key;
		HashMap<String, PriorityQueue<Integer>> map = new HashMap<>();

		long sum = 0;
		int q = Integer.parseInt(br.readLine());

		while (q-- > 0) {
			st = new StringTokenizer(br.readLine());

			if (st.nextToken().equals("1")) {
				key = st.nextToken();
				int x = Integer.parseInt(st.nextToken());

				PriorityQueue<Integer> pq = map.getOrDefault(key, new PriorityQueue<>(Comparator.reverseOrder()));

				while (x-- > 0) {
					pq.offer(Integer.parseInt(st.nextToken()));
				}

				map.put(key, pq);
				continue;
			}

			key = st.nextToken();
			int x = Integer.parseInt(st.nextToken());
			PriorityQueue<Integer> pq = map.get(key);

			if (pq == null) continue;
			if (x >= pq.size()) while (!pq.isEmpty()) sum += pq.poll();
			else for (int i = 0; i < x; i++) sum += pq.poll();
		}

		System.out.println(sum);
	}
}