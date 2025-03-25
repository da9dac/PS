import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];
		arr[0] = 1;
		int cur = 0;
		int cnt = 0;

		while (true) {
			int x = arr[cur];

			if (x == m) {
				break;
			}

			int idx;

			if (x % 2 != 0) {
				idx = (cur + l) % n;
				arr[idx]++;
			} else {
				idx = cur - l;
				if (idx < 0) idx = idx + n;
				arr[idx]++;
			}

			cnt++;
			cur = idx;
		}

		System.out.println(cnt);
	}
}