import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		PriorityQueue<Player>[] pqs = new PriorityQueue[12];

		for (int i = 1; i < 12; i++) {
			pqs[i] = new PriorityQueue<>();
		}

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			int p = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());

			pqs[p].offer(new Player(p, w));
		}

		for (int i = 0; i < k; i++) {
			int sum = 0;

			for (int j = 1; j < 12; j++) {
				Player p = pqs[j].poll();

				if (p == null) continue;

				p.downW();

				pqs[j].offer(p);
			}

			for (int j = 1; j < 12; j++) {
				Player p = pqs[j].peek();

				if (p == null) continue;

				sum += p.w;
			}

			if (i == k - 1) {
				System.out.println(sum);
			}
		}
	}

	static class Player implements Comparable<Player> {
		int x;
		int w;

		public Player(int x, int w) {
			this.x = x;
			this.w = w;
		}

		public void downW() {
			this.w -= 1;
		}

		public int compareTo(Player other) {
			return other.w - this.w;
		}
	}
}