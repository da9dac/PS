import java.io.*;
import java.util.*;

public class Main {

	static int n, min = Integer.MAX_VALUE;
	static int[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		arr = new int[n][2];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		solve(0, 1, 0);

		System.out.println(min);
	}

	static void solve(int start, int s, int d) {
		if (start == n) return;

		for (int i = start; i < n; i++) {
			int ns = s * arr[i][0];
			int nd = d + arr[i][1];

			min = Math.min(min, Math.abs(ns - nd));

			solve(i + 1, ns, nd);
		}
	}
}