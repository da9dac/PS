import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String input = null;

		int[] cnts = new int[26];

		while ((input = br.readLine()) != null) {
			st = new StringTokenizer(input);

			while (st.hasMoreTokens()) {
				String word = st.nextToken();

				for (int i = 0; i < word.length(); i++) {
					cnts[word.charAt(i) - 'a']++;
				}
			}
		}

		int max = 0;

		for (int cnt : cnts) {
			max = Math.max(max, cnt);
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < cnts.length; i++) {
			if (cnts[i] == max) {
				sb.append((char)('a' + i));
			}
		}

		System.out.println(sb);
	}
}