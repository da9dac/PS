import java.io.*;
import java.util.*;

public class Main {

	private static int k, n;
	private static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		k = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());

		arr = new int[k];

		for (int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		long s = 1;
		long e = Integer.MAX_VALUE;

		while (s < e) {
			long m = (s + e + 1)/2;
			if (solve(m)) s = m;
			else e = m - 1;
		}

		System.out.println(s);
	}

	private static boolean solve(long m) {
		long cnt = 0;
		for (int i = 0; i < k; i++) {
			cnt += arr[i] / m;
		}
		return cnt >= n;
	}
}