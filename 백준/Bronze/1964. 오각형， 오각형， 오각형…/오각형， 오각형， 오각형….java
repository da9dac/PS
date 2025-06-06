import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		long[] arr = new long[n + 1];

		arr[1] = 5;
		int x = 3;

		for (int i = 2; i <= n; i++) {
			arr[i] = (arr[i - 1] + 5L * i - x) % 45678;
			x += 2;
		}

		System.out.println(arr[n]);
	}
}