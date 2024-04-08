import java.io.*;
import java.util.*;

public class Main {

	static int n, max = -1000000;
	static int[] arr, nums;
	static boolean[] isUsed;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		arr = new int[n];
		nums = new int[n];
		isUsed = new boolean[n];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		solve(0);

		System.out.println(max);
	}

	static void solve(int cnt) {
		if (cnt == n) {
			int sum = 0;

			for (int i = 0; i < n - 1; i++) {
				sum += Math.abs(nums[i] - nums[i+1]);
			}

			max = Math.max(max, sum);
			return;
		}

		for (int i = 0; i < n; i++) {
			if (isUsed[i]) continue;
			isUsed[i] = true;
			nums[cnt] = arr[i];
			solve(cnt + 1);
			isUsed[i] = false;
		}
	}

}