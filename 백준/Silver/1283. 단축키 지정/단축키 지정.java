import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		boolean[] isUsed = new boolean[26];

		while (n-- > 0) {
			String option = br.readLine();
			String[] words = option.split(" ");

			StringBuilder tmp = new StringBuilder();

			boolean isFind = false;

			for (String word : words) {
				String up = word.toUpperCase();

				if (isFind) {
					tmp.append(word).append(" ");
					continue;
				}

				int idx = up.charAt(0) - 'A';

				if (isUsed[idx]) tmp.append(word).append(" ");
				else {
					isFind = true;
					isUsed[idx] = true;
					tmp.append("[").append(word.charAt(0)).append("]");
					for (int j = 1; j < word.length(); j++) {
						tmp.append(word.charAt(j));
					}
					tmp.append(" ");
				}
			}

			if (isFind) {
				sb.append(tmp).append("\n");
				continue;
			}

			tmp = new StringBuilder();

			for (String word : words) {
				String up = word.toUpperCase();

				if (isFind) {
					tmp.append(word).append(" ");
					continue;
				}

				for (int j = 0; j < word.length(); j++) {
					int idx = up.charAt(j) - 'A';
					if (isUsed[idx] || isFind) tmp.append(word.charAt(j));
					else {
						isFind = true;
						isUsed[idx] = true;
						tmp.append("[").append(word.charAt(j)).append("]");
					}
				}

				tmp.append(" ");
			}

			sb.append(tmp).append("\n");
		}

		System.out.println(sb);
	}
}