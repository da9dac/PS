import java.io.*;
import java.util.*;

class Main {
    static String a, b;
    
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		a = st.nextToken();
		b = st.nextToken();

		int x = a.length();
		int y = b.length();

		boolean[] arr = new boolean[26];

		for (int i = 0; i < x; i++) {
			int c = a.charAt(i) - 'A';

			if (arr[c]) continue;

			arr[c] = true;

            int fy = -1;

			for (int j = 0; j < y; j++) {
				if (c == b.charAt(j) - 'A') {
					fy = j;
					break;
				}
			}

			if (fy != -1) {
				solve(x, y, i, fy);
				break;
			}
		}
	}

	static void solve(int x, int y, int fx, int fy) {
		char[][] arr = new char[y][x];

		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				arr[i][j] = '.';
			}
		}

		for (int i = 0; i < x; i++) {
			arr[fy][i] = a.charAt(i);
		}

		for (int i = 0; i < y; i++) {
			arr[i][fx] = b.charAt(i);
		}

		StringBuilder sb = new StringBuilder();

		for (char[] chs : arr) {
			sb.append(new String(chs)).append("\n");
		}

		System.out.println(sb);
	}
}