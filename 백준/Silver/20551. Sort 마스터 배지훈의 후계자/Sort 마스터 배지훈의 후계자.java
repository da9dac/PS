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
			int right = n - 1;
			int firstIdx = -1;

			while (left <= right) {
				int mid = (left + right) / 2;
				int diff = arr[mid] - d;

				if (diff < 0) {
					left = mid + 1;
				} else if (diff > 0) {
					right = mid - 1;
				} else {
					for (int i = mid; i >= 0; i--) {
						if (arr[i] == d) firstIdx = i;
						else break;
					}
					break;
				}
			}

			sb.append(firstIdx).append("\n");
		}

		System.out.println(sb);
	}
}