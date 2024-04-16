import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		long max = 0;

		PriorityQueue<Gem> gems = new PriorityQueue<>();
		PriorityQueue<Integer> bags = new PriorityQueue<>();
		PriorityQueue<Integer> values = new PriorityQueue<>(Comparator.reverseOrder());

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			int m = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			gems.offer(new Gem(m, v));
		}

		for (int i = 0; i < k; i++) {
			int c = Integer.parseInt(br.readLine());
			bags.offer(c);
		}

		while (!bags.isEmpty()) {
			int bag = bags.poll();

			while (!gems.isEmpty()) {
				Gem gem = gems.peek();

				if (gem.m > bag) break;

				gems.poll();
				values.offer(gem.v);
			}

			if (!values.isEmpty()) max += values.poll();
		}

		System.out.println(max);
	}

	static class Gem implements Comparable<Gem> {
		int m, v;

		Gem(int m, int v) {
			this.m = m;
			this.v = v;
		}

		@Override
		public int compareTo(Gem o) {
			return this.m != o.m ? this.m - o.m : o.v - this.v;
		}
	}
}