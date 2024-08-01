import java.io.*;
import java.util.*;

public class Main {

	static final String ZERO = "Nalmeok", IMPOSSIBLE = "I love HanYang University";
	static int d, m;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		char[] arr = br.readLine().toCharArray();

		StringTokenizer st = new StringTokenizer(br.readLine());

		d = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		int cnt = 0;
		int min = 0;
		int h = 0, y = 0, u = 0;

		for(int i = 0; i < n; i++) {
			char c = arr[i];

			if (c == 'H') {
				h++;
				min += calculate(cnt);
				cnt = 0;
			}
			else if (c == 'Y') {
				y++;
				min += calculate(cnt);
				cnt = 0;
			}
			else if (c == 'U') {
				u++;
				min += calculate(cnt);
				cnt = 0;
			}
			else {
				cnt++;
			}
		}

		min += calculate(cnt);

		sb.append(min == 0 ? ZERO : min).append("\n");
		sb.append(h * y * u == 0 ? IMPOSSIBLE : Math.min(h, Math.min(y, u)));

		System.out.println(sb);
	}

	static int calculate(int cnt) {
		if (cnt == 0) return 0;
		return Math.min(cnt * d, d + m);
	}
}