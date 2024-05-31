import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		String name, ring;
		int n = Integer.parseInt(br.readLine());

		Map<String, List<String>> map = new HashMap<>();

		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());

			name = st.nextToken();
			ring = st.nextToken();

			if (ring.equals("-")) continue;

			List<String> list = map.getOrDefault(ring, new ArrayList<>());
			list.add(name);

			if (list.size() == 1) map.put(ring, list);
		}

		int cnt = 0;

		for (String key : map.keySet()) {
			List<String> list = map.get(key);

			if (list.size() == 2) {
				cnt++;
				sb.append(list.get(0)).append(" ").append(list.get(1)).append("\n");
			}
		}

		System.out.println(cnt);
		System.out.println(sb);
	}
}