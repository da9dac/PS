import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());

		int[] home = new int[9];
		int[] away = new int[9];

		for (int i = 0; i < 9; i++) {
			home[i] = Integer.parseInt(st.nextToken());
			away[i] = Integer.parseInt(st2.nextToken());
		}

		int score = 0;
		boolean mid = false;

		for (int i = 0; i < 9; i++) {
			score += home[i];
			if (score > 0) {
				mid = true;
			}
			score -= away[i];
		}

		System.out.println(score < 0 && mid ? "Yes" : "No");
	}
}