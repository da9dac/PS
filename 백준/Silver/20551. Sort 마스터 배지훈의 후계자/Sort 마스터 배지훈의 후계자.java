import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		StringBuilder sb = new StringBuilder();

		while (m-- > 0) {
			int d = Integer.parseInt(br.readLine());

			int left = 0;
			int right = n;

			while (left < right) {
				int mid = (left + right) / 2;
				if (arr[mid] < d) {
					left = mid + 1;
				} else {
					right = mid;
				}
			}

			if (left < n && arr[left] == d) {
				sb.append(left).append("\n");
			} else {
				sb.append(-1).append("\n");
			}
		}

		System.out.println(sb);
	}
}