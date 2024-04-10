import java.io.*;
import java.util.*;

class Main {
    static int n, max = -1000000001, min = Integer.MAX_VALUE;
	static int plus, minus, multi, div;
	static int[] nums;
	static boolean[] isUsed;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		n = Integer.parseInt(br.readLine());
		nums = new int[n];
		isUsed = new boolean[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) nums[i] = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		plus = Integer.parseInt(st.nextToken());
		minus = Integer.parseInt(st.nextToken());
		multi = Integer.parseInt(st.nextToken());
		div = Integer.parseInt(st.nextToken());

		solve(0, 0);

		sb.append(max).append("\n").append(min);
		System.out.println(sb);
	}

	static void solve(int size, int sum) {
		if (size == n) {
			min = Math.min(min, sum);
			max = Math.max(max, sum);
			return;
		}

		if (size == 0) {
			solve(size + 1, sum + nums[size]);
		} else {
			if (plus > 0) {
				plus--;
				solve(size + 1, sum + nums[size]);
				plus++;
			}

			if (minus > 0) {
				minus--;
				solve(size + 1, sum - nums[size]);
				minus++;
			}

			if (multi > 0) {
				multi--;
				solve(size + 1, sum * nums[size]);
				multi++;
			}

			if (div > 0) {
				div--;
				solve(size + 1, sum / nums[size]);
				div++;
			}
		}
	}
}