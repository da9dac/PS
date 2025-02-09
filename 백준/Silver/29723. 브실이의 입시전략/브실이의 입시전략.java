import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		m -= k;

		Map<String, Integer> mx = new HashMap<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			String name = st.nextToken();
			int score = Integer.parseInt(st.nextToken());

			mx.put(name, score);
		}

		int score = 0;

		while (k-- > 0) {
			String key = br.readLine();
			score += mx.get(key);
			mx.remove(key);
		}

		List<Integer> scores = new ArrayList<>();

		for (String key : mx.keySet()) {
			scores.add(mx.get(key));
		}

		Collections.sort(scores);
		int len = scores.size();

		int min = score;
		int max = score;

		for (int i = 0; i < m; i++) {
			min += scores.get(i);
			max += scores.get(len - i - 1);
		}

		System.out.println(min + " " + max);
    }
}