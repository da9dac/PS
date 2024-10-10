import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int idx = 0;
		int cnt = 0;

		Map<Integer, String> map = new HashMap<>();

		map.put(0, "zero");
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");

		Pair[] arr = new Pair[n - m + 1];

		for (int i = m; i <= n; i++) {
			String num = i + "";
			StringBuilder sb = new StringBuilder();

			for (char c : num.toCharArray()) {
				sb.append(map.get(c - '0'));
			}

			arr[idx++] = new Pair(i, sb.toString());
		}

		Arrays.sort(arr, Comparator.comparing(a -> a.str));

		StringBuilder sb = new StringBuilder();

		for (Pair p : arr) {
			if (cnt == 10) {
				sb.append("\n");
				cnt = 0;
			}
			sb.append(p.num).append(" ");
			cnt++;
		}

		System.out.println(sb);
	}

	static class Pair {
		int num;
		String str;

		public Pair(int num, String str) {
			this.num = num;
			this.str = str;
		}
	}
}