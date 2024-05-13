import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int result = Integer.MAX_VALUE;
		int start = 0;

		int max = n / 5;

		for (int i = 0; i <= max; i++) {
			int cnt = start;

			if (n % 2 == 0) {
				cnt += (n / 2);
				result = cnt;
			}

			if (n >= 5) {
				n -= 5;
				start++;
			}
		}

		System.out.println(result == Integer.MAX_VALUE ? -1 : result);
	}
}