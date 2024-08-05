import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Map<String, String> map = new HashMap<>();

		while (n-- > 0) {
			String origin = br.readLine();
			int len = origin.length();

			if (len <= 2) continue;

			char[] mid = origin.substring(1, len - 1).toCharArray();
			Arrays.sort(mid);

			StringBuilder sb = new StringBuilder();
			sb.append(origin.charAt(0)).append(mid).append(origin.charAt(len - 1));

			map.put(sb.toString(), origin);
		}

		int m = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < m; i++) {
			String origin = st.nextToken();
			int len = origin.length();

			if (len <= 2) {
				sb.append(origin).append(" ");
				continue;
			}

			char[] mid = origin.substring(1, len - 1).toCharArray();
			Arrays.sort(mid);

			StringBuilder tmp = new StringBuilder();
			tmp.append(origin.charAt(0)).append(mid).append(origin.charAt(len - 1));

			sb.append(map.get(tmp.toString())).append(" ");
		}

		System.out.println(sb);
	}
}