import java.io.*;

public class Main {

	static String[] cows = {
		"Beatrice",
		"Belinda",
		"Bella",
		"Bessie",
		"Betsy",
		"Blue",
		"Buttercup",
		"Sue",
		""
	};

	static int n;
	static String[] comb = new String[9];
	static String[][] conditions;
	static boolean[] isUsed = new boolean[8];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] strs;
		comb[8] = "";

		n = Integer.parseInt(br.readLine());
		conditions = new String[n][2];

		for (int i = 0; i < n; i++) {
			strs = br.readLine().split(" ");

			conditions[i][0] = strs[0];
			conditions[i][1] = strs[5];
		}

		combine(0);

		for (int i = 0; i < 8; i++) {
			sb.append(comb[i]).append("\n");
		}

		System.out.println(sb);
	}

	static boolean combine(int size) {
		if (size == 8) {
			return isCorrect();
		}

		for (int i = 0; i < 8; i++) {
			if (isUsed[i]) continue;

			isUsed[i] = true;
			comb[size] = cows[i];
			if (combine(size + 1)) {
				return true;
			}
			isUsed[i] = false;
		}

		return false;
	}

	static boolean isCorrect() {
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 8; j++) {
				if (comb[j].equals(conditions[i][0]) && comb[j + 1].equals(conditions[i][1])) cnt++;
				if (comb[j].equals(conditions[i][1]) && comb[j + 1].equals(conditions[i][0])) cnt++;
			}
		}

		return cnt == n;
	}
}