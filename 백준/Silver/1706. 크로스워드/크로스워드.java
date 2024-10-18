import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		char[][] puzzle = new char[r][c];

		for (int i = 0; i < r; i++) {
			puzzle[i] = br.readLine().toCharArray();
		}

		PriorityQueue<String> pq = new PriorityQueue<>();

		for (int i = 0; i < r; i++) {
			String[] arr = new String(puzzle[i]).split("#");
			for (String s : arr) {
				if (s.length() >= 2) pq.offer(s);
			}
		}

		char[] chs = new char[r];

		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				chs[j] = puzzle[j][i];
			}
			String[] arr = new String(chs).split("#");
			for (String s : arr) {
				if (s.length() >= 2) pq.offer(s);
			}
		}

		System.out.println(pq.poll());
	}
}