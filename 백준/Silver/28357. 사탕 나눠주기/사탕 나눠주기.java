import java.io.*;
import java.util.*;

class Main {
    
    static int n;
    static long k;
	static long[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		k = Long.parseLong(st.nextToken());
		long left = 0;
		long right = 0;

		st = new StringTokenizer(br.readLine());

		arr = new long[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(st.nextToken());
			right = Math.max(right, arr[i]);
		}
        
        long min = right;

		while (left < right) {
			long mid = (left + right) / 2;

			if (isPossible(mid)) {
				right = mid;
				min = Math.min(min, right);
			} else {
				left = mid + 1;
			}
		}

		System.out.println(min);
	}

	static boolean isPossible(long x) {
		long cnt = 0;

		for (long t : arr) {
			if (t > x) cnt += t - x;
		}

		return cnt <= k;
	}
}