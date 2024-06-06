import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		String input;

		while (!(input = br.readLine()).equals("0")) {
			st = new StringTokenizer(input);

			int d = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());

			int min = 0;
			int max = 0;
			int cnt = 0;

			for (int i = 0; i < d; i++) {
				int cost = Integer.parseInt(st.nextToken());

				if (min == 0) {
					if (m >= cost) {
						cnt = m / cost;
						min = cost;
					}
					continue;
				}

				if (min < cost) {
					max = Math.max(max, (cost * cnt) - (min * cnt));
				} else {
					min = cost;
					cnt = m / cost;
				}
			}

			sb.append(max).append("\n");
		}

		System.out.println(sb);
	}
}