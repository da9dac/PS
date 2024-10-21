import java.io.*;
import java.util.*;

class Main {
	static String jaehak = "jaehak";
	static String notyet = "notyet";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		PriorityQueue<Participant> pq = new PriorityQueue<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			String name = st.nextToken();
			boolean isJaehak = st.nextToken().equals(jaehak);
			boolean isNotyet = st.nextToken().equals(notyet);
			int shake = Integer.parseInt(st.nextToken());
			int apc = Integer.parseInt(st.nextToken());

			if (!isJaehak || !isNotyet) continue;
			if (shake != -1 && shake < 4) continue;

			pq.offer(new Participant(name, apc));
		}

		int size = Math.min(pq.size(), 10);

		Participant[] participants = new Participant[size];

		for (int i = 0; i < size; i++) {
			participants[i] = pq.poll();
		}

		Arrays.sort(participants, Comparator.comparing(a -> a.name));

		StringBuilder sb = new StringBuilder();

		sb.append(size).append('\n');

		for (int i = 0; i < size; i++) {
			sb.append(participants[i].name).append('\n');
		}

		System.out.println(sb);
	}

	static class Participant implements Comparable<Participant> {
		String name;
		int a;

		Participant(String name, int a) {
			this.name = name;
			this.a = a;
		}

		public int compareTo(Participant other) {
			return this.a - other.a;
		}
	}
}