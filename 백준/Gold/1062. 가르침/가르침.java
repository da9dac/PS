import java.io.*;

public class Main {

	static int n, k, max = 0;
	static boolean[] isUsed = new boolean[26];
	static String[] strs;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");

		n = Integer.parseInt(input[0]);
		k = Integer.parseInt(input[1]);

		if (k < 5) {
			System.out.println(max);
			return;
		}

		strs = new String[n];

		isUsed[0] = isUsed[2] = isUsed[8] = isUsed[13] = isUsed[19] = true;

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			strs[i] = str.substring(4, str.length() - 4);
		}

		solve(1, 5);

		System.out.println(max);
	}

	static void solve(int start, int size) {
		if (size == k) {
			int cnt = getCnt();

			if (max < cnt) max = cnt;

			return;
		}

		for (int i = start; i < 26; i++) {
			if (isUsed[i]) continue;

			isUsed[i] = true;

			solve(i + 1, size + 1);

			isUsed[i] = false;
		}
	}

	static int getCnt() {
		int cnt = 0;

		for (String str : strs) {
			boolean isRead = true;

			for (int i = 0; i < str.length(); i++) {
				if (!isUsed[str.charAt(i) - 'a']) {
					isRead = false;
					break;
				}
			}

			if (isRead) cnt++;
		}
		return cnt;
	}
}