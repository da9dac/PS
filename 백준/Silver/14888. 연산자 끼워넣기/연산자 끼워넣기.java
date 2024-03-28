import java.io.*;
import java.util.*;

class Main {

    static int n, plus, minus, multi, div;
	static int min = 1000000001, max = -1000000001;
	static int[] arr;
	static boolean[] isUsed;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		isUsed = new boolean[n];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());

		plus = Integer.parseInt(st.nextToken());
		minus = Integer.parseInt(st.nextToken());
		multi = Integer.parseInt(st.nextToken());
		div = Integer.parseInt(st.nextToken());

		solve(arr[0], 2);

		sb.append(max).append("\n").append(min);

		System.out.println(sb);
	}

	static void solve(int result, int cur) {
		if(cur > n) {
			min = Math.min(min, result);
			max = Math.max(max, result);
			return;
		}

		if (plus != 0) {
			plus--;
			solve(result + arr[cur - 1], cur + 1);
			plus++;
		}

		if (minus != 0) {
			minus--;
			solve(result - arr[cur - 1], cur + 1);
			minus++;
		}

		if (multi != 0) {
			multi--;
			solve(result * arr[cur - 1], cur + 1);
			multi++;
		}

		if (div != 0) {
			div--;
			solve(result / arr[cur - 1], cur + 1);
			div++;
		}

	}
}