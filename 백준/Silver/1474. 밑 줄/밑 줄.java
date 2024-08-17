import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int u = 0, l = 0;
		int sum = 0;

		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
			sum += arr[i].length();
			if (Character.isLowerCase(arr[i].charAt(0))) l++;
			else u++;
		}

		int x = m - sum;
		int a = x / (n - 1);
		int b = x % (n - 1);

		String[] dashes = new String[n];

		StringBuilder tmp = new StringBuilder();
		for (int i = 0; i < a; i++) {
			tmp.append("_");
		}

		String as = tmp.toString();
		tmp.append("_");
		String bs = tmp.toString();

		for (int i = 1; i < n; i++) {
			String s = arr[i];

			if (b == 0 || l == 0) break;

			if (Character.isLowerCase(s.charAt(0))) {
				dashes[i] = bs;
				l--;
				b--;
			}
		}

		if (b != 0) {
			for (int i = n - 1; i >= 0; i--) {
				if (dashes[i] != null) continue;
				dashes[i] = bs;
				b--;
				if (b == 0) break;
			}
		}

		for (int i = 1; i < n; i++) {
			if (dashes[i] != null) continue;
			dashes[i] = as;
		}

		sb.append(arr[0]);

		for (int i = 1; i < n; i++) {
			sb.append(dashes[i]).append(arr[i]);
		}

		System.out.println(sb);
	}
}