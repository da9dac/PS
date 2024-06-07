import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());

			long n = Long.parseLong(st.nextToken());
			long k = Long.parseLong(st.nextToken());

			while (n > 0 && k > 0) {
				n /= 2;
				k--;
			}

			sb.append((n + 1) / 2).append("\n");
		}

		System.out.println(sb);
	}
}