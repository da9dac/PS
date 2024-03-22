import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
        
		long[][] dp = new long[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; j++) {
				dp[i][j] = dp[i][j - 1] + Integer.parseInt(st.nextToken());
			}
		}

		while (m-- > 0) {
			st = new StringTokenizer(br.readLine());

			int sx = Integer.parseInt(st.nextToken());
			int sy = Integer.parseInt(st.nextToken());
			int ex = Integer.parseInt(st.nextToken());
			int ey = Integer.parseInt(st.nextToken());

			long result = 0;

			for (int i = sx; i <= ex; i++) {
				result += (dp[i][ey] - dp[i][sy - 1]);
			}

			sb.append(result).append("\n");
		}

		System.out.println(sb);
    }
}