import java.io.*;
import java.util.*;

public class Main {

	static int calc(HashMap<Integer, Integer> mp, int a, int b) {
		int c = Math.min(mp.getOrDefault(a, 0), mp.getOrDefault(b, 0));
		mp.put(a, mp.getOrDefault(a, 0) - c);
		mp.put(b, mp.getOrDefault(b, 0) - c);
		return c * (a ^ b);
	}

	static void solve(BufferedReader br) throws IOException {
		int n = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> mp = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(st.nextToken());
			mp.put(x, mp.getOrDefault(x, 0) + 1);
		}

		int result = calc(mp, 0, 3) + calc(mp, 1, 2) +
			calc(mp, 0, 2) + calc(mp, 1, 3) +
			calc(mp, 0, 1) + calc(mp, 2, 3);

		System.out.println(result);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		solve(br);
	}
}
