import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		char[][] lines = new char[n][n];

		for (int i = 0; i < n; i++) {
			lines[i] = br.readLine().toCharArray();
		}

		int x = 0;
		int y = 0;

		int la = 0;
		int ra = 0;
		int m = 0;
		int ll = 0;
		int rl = 0;

		StringBuilder sb = new StringBuilder();

		out:
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (lines[i][j] == '*') {
					x = i + 1;
					y = j;
					sb.append(x + 1).append(" ").append(y + 1).append("\n");
					break out;
				}
			}
		}

		for (int i = y - 1; i >= 0; i--) {
			if (lines[x][i] == '_') break;
			la++;
		}

		for (int i = y + 1; i < n; i++) {
			if (lines[x][i] == '_') break;
			ra++;
		}

		for (int i = x + 1; i < n; i++) {
			if (lines[i][y] == '_') {
				x = i;
				break;
			}
			m++;
		}

		for (int i = x; i < n; i++) {
			if (lines[i][y - 1] == '_') break;
			ll++;
		}

		for (int i = x; i < n; i++) {
			if (lines[i][y + 1] == '_') break;
			rl++;
		}

		sb.append(la).append(" ").append(ra).append(" ").append(m).append(" ").append(ll).append(" ").append(rl);

		System.out.println(sb);
	}
}