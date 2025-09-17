import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[n];
		boolean[] isExist = new boolean[2000001];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int x = Integer.parseInt(br.readLine());

		int cnt = 0;

		for (int i = 0; i < n; i++) {
			int cur = arr[i];
			int tar = x - cur;

			if (tar > 0 && isExist[tar]) {
				cnt++;
			}

			isExist[cur] = true;
		}

		System.out.println(cnt);
	}
}