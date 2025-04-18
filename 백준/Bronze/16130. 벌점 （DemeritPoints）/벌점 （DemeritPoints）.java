import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String weapon = "(weapon)";
		String nine = "(09)";

		StringBuilder sb = new StringBuilder();

		while (n-- > 0) {
			String info = br.readLine();
			int len = info.length();

			int sum = 0;
			int week = 0;
			int flag = 0;

			for (int i = 0; i < len; i++) {
				char x = info.charAt(i);
				int score = Character.isDigit(x) ? x - '0' : x - 55;

				int prev = sum / 10;
				sum += score;
				int next = sum / 10;

				if (prev < next) {
					if (next < 4) {
						week += next;
					} else {
						flag = (next == 4) ? 1 : 2;
						break;
					}
				}
			}

			sb.append(week);

			if (flag != 0) sb.append(flag == 1 ? weapon : nine);

			sb.append("\n");
		}

		System.out.println(sb);
	}
}

