import java.io.*;

public class Main {

	static int n, cnt = 0;
	static int[] roma = {1, 5, 10, 50};
	static boolean[] isFirst = new boolean[1001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		solve(0, 0, 0);

		System.out.println(cnt);
	}

	static void solve(int num, int size, int idx) {
		if (size == n) {
			if (!isFirst[num]) {
				isFirst[num] = true;
				cnt++;
			}
			return;
		}

		for (int i = idx; i < 4; i++) {
			solve(num + roma[i], size + 1, i);
		}
	}
}