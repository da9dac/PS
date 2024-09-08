import java.io.*;
import java.util.*;

public class Main {
	static int n, min, max;
	static char[] alice, nums;
	static boolean[] used;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());

			StringBuilder bob = new StringBuilder(br.readLine());
			alice = br.readLine().toCharArray();
			nums = new char[n];
			used = new boolean[n];

			max = 0;
			min = Math.min(
				Integer.parseInt(bob.toString()),
				Integer.parseInt(bob.reverse().toString())
			);

			solve(0);

			sb.append(max).append("\n");
		}

		System.out.println(sb);
	}

	static void solve(int size) {
		for (int i = 0; i < n; i++) {
			if (used[i]) continue;
			used[i] = true;
			nums[size] = alice[i];
			makeNum(size + 1);
			solve(size + 1);
			used[i] = false;
		}
	}

	static void makeNum(int size) {
		String str = new String(Arrays.copyOfRange(nums, 0, size));
		int num = Integer.parseInt(str);

		if (num < min) {
			max = Math.max(num, max);
		}
	}
}