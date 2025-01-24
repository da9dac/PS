import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		if (n == 0) {
			System.out.println(-1);
			return;
		} else if (n == 1) {
			System.out.println(1);
			return;
		}

		int count = 1;
		int num = 1;

		while (true) {
			if (num % n == 0) {
				System.out.println(count);
				break;
			}
			num = (num * 10 + 1) % n;
			count++;

			if (count > n * 2) {
				System.out.println(-1);
				break;
			}
		}
	}
}