import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());

		int[] count = new int[10];

		while (x > 0) {
			count[x % 10]++;
			x /= 10;
		}

		int max = 0;
		int sn = (count[6] + count[9] + 1) / 2;

		for (int i = 0; i < 10; i++) {
			if (i == 6 || i == 9) continue;
			max = Math.max(max, count[i]);
		}

		System.out.println(Math.max(max, sn));
	}
}