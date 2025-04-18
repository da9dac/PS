import java.io.*;

class Main {
	static final String LIFE = "(weapon)";
	static final String PERMANENT = "(09)";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		while (n-- > 0) {
			int sum = 0;
			int week = 0;
			int flag = 0;

			for (char x : br.readLine().toCharArray()) {
				int score = Character.isDigit(x) ? x - '0' : x - 55;

				int prev = sum / 10;
				sum += score;
				int next = sum / 10;

				if (prev >= next) continue;

				if (next >= 4) {
					flag = next == 4 ? 1 : 2;
					break;
				}

				week += next;
			}

			sb.append(week);

			if (flag != 0) sb.append(flag == 1 ? LIFE : PERMANENT);

			sb.append("\n");
		}

		System.out.println(sb);
	}
}

