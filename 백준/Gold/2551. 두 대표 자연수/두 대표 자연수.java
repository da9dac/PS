import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		long[] input = new long[n + 1];

		long[] sums = new long[n + 1];
		long[] squares = new long[n + 1];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= n; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(input, 1, n + 1);

		for (int i = 1; i <= n; i++) {
			sums[i] = sums[i - 1] + input[i];
			squares[i] = squares[i - 1] + input[i] * input[i];
		}

		long min = Long.MAX_VALUE;
		int cur = 0;

		for (int i = 1; i <= n; i++) {
			long sum = (i-1)*input[i] - sums[i-1] - (n-i)*input[i] + sums[n] - sums[i];

			if (sum < min) {
				min = sum;
				cur = i;
			}
		}

		sb.append(input[cur]).append(" ");

		min = Long.MAX_VALUE;
		cur = 0;

		for (int i = 1; i < 10001; i++) {
			long sum = (long)i * i * n + squares[n] - 2 * i * sums[n];

			if (sum < min) {
				min = sum;
				cur = i;
			}
		}

		sb.append(cur);

		System.out.println(sb);
	}
}