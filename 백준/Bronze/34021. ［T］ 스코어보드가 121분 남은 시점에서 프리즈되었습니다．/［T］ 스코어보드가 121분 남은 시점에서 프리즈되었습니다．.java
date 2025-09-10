import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int t = Integer.parseInt(br.readLine());

		while(t-- > 0) {
			st = new StringTokenizer(br.readLine());

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());

			int max = l;

			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < n; i++) {
				int cur = Integer.parseInt(st.nextToken());

				if (cur == -1) continue;

				max = Math.max(m - cur, max);
			}

			sb.append("The scoreboard has been frozen with ")
				.append(max)
				.append(max == 1 ? " minute remaining." : " minutes remaining.")
				.append("\n");
		}

		System.out.println(sb);
	}
}