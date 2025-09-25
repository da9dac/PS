import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		Deque<Integer> deque = new LinkedList<>();

		for (int i = 1; i <= n; i++) {
			deque.offer(i);
		}

		int sum = 0;

		for (int i = 0; i < m; i++) {
			int target = Integer.parseInt(st.nextToken());
			int targetIdx = ((LinkedList<Integer>)deque).indexOf(target);
			int mid = deque.size() / 2;

			if (targetIdx <= mid) {
				while (deque.peekFirst() != target) {
					sum++;
					deque.offerLast(deque.pollFirst());
				}

				deque.pollFirst();
			} else {
				while (deque.peekLast() != target) {
					sum++;
					deque.offerFirst(deque.pollLast());
				}

				sum++;
				deque.pollLast();
			}
		}

		System.out.println(sum);
	}
}