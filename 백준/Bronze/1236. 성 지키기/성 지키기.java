import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		boolean[] used = new boolean[m];
		int x = n;

		for (int i = 0; i < n; i++) {
			char[] arr = br.readLine().toCharArray();
			boolean b = false;
			for (int j = 0; j < m; j++) {
				char c = arr[j];
				if (c == 'X') {
					b = true;
					used[j] = true;
				}
			}
			if (b) x--;
		}

		int y = m;

		for (int i = 0; i < m; i++) {
			if (used[i]) y--;
		}

		System.out.println(Math.max(x, y));
	}
}