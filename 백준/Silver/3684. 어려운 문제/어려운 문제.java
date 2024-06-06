import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int mod = 10001, a = 0, b = 0;
		int t = Integer.parseInt(br.readLine());

		int[] arr = new int[t];

		for (int i = 0; i < t; i++) arr[i] = Integer.parseInt(br.readLine());

		out:
		for (int i = 0; i < mod; i++) {
			for (int j = 0; j < mod; j++) {
				int cnt = 0;

				for (int k = 0; k < t - 1; k++) {
					int num = (i * arr[k] + j) % mod;
					if (arr[k + 1] == (i * num + j) % mod) cnt++;
					else break;
				}

				if (cnt == t - 1) {
					a = i;
					b = j;
					break out;
				}
			}
		}

		for (int i = 0; i < t; i++) {
			sb.append((a * arr[i] + b) % mod).append("\n");
		}

		System.out.println(sb);
	}
}