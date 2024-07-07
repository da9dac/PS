import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int sum = 0;

		while(n-- > 0) {
			int l = Integer.parseInt(br.readLine());
			int max = -10001;

			int s = 0;
			int e = 0;
			int maxS = 0;
			int maxE = 0;

			int[] values = new int[l + 1];

			st = new StringTokenizer(br.readLine());

			for (int i = 1; i <= l; i++) {
				int value = Integer.parseInt(st.nextToken());

				int prev = values[i - 1] + value;

				if (value >= prev) {
					s = e = i;
				} else {
					value = prev;
					e = i;
				}
				values[i] = value;

				if (value > max) {
					max = value;
					maxS = s;
					maxE = e;
				} else if (value == max && e - s < maxE - maxS) {
					maxS = s;
					maxE = e;
				}
			}

			sum += max;
			sb.append(maxS).append(" ").append(maxE).append("\n");
		}

		System.out.println(sum);
		System.out.println(sb);
	}
}