import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n + 1];

		StringTokenizer st = new StringTokenizer(br.readLine());

		Stack<Tower> towers = new Stack<>();

		for (int i = 1; i <= n; i++) {
			int cur = Integer.parseInt(st.nextToken());

			if (!towers.isEmpty()) {
				while (!towers.isEmpty()) {
					Tower peek = towers.peek();
					if (cur > peek.heigth) {
						towers.pop();
					} else {
						arr[i] = peek.number;
						break;
					}
				}
			}

			towers.push(new Tower(i, cur));
		}

		for (int i = 1; i <= n; i++) {
			sb.append(arr[i]).append(" ");
		}

		System.out.println(sb);
	}

	static class Tower {
		int number;
		int heigth;

		public Tower(int number, int heigth) {
			this.number = number;
			this.heigth = heigth;
		}
	}
}