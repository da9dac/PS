import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int l = 1;
		int r = 1;
		int sum = 1;
		int cnt = 1;

		while (l < n) {
			if (sum <= n) {
				if (sum == n) cnt++;
				sum += ++r;
			} else {
				sum -= l++;
			}
		}

		System.out.println(cnt);
	}
}