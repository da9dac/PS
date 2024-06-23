import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		char[][] v = new char[n][m];
		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			for (int j = 0; j < m; j++) {
				v[i][j] = line.charAt(j);
			}
		}

		int[] ans = {1000, 1000};
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (n % i != 0 || m % j != 0) continue;
				if (check(n, m, v, i, j) && i * j < ans[0] * ans[1]) {
					ans[0] = i;
					ans[1] = j;
				}
			}
		}

		sb.append(ans[0]).append(" ").append(ans[1]).append("\n");

		for (int i = 0; i < ans[0]; i++) {
			for (int j = 0; j < ans[1]; j++) {
				sb.append(v[i * n / ans[0]][j * m / ans[1]]);
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}

	static boolean check(int ni, int mj, char[][] v, int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < ni / n; k++) {
					for (int l = 0; l < mj / m; l++) {
						if (v[i * ni / n + k][j * mj / m + l] != v[i * ni / n][j * mj / m]) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}
}