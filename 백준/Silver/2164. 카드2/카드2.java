import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= n; i++) {
			queue.offer(i);
		}

		while (queue.size() > 2) {
			queue.poll();
			queue.offer(queue.poll());
		}

		int x = queue.poll();

		System.out.println(queue.isEmpty() ? x : (int) queue.poll());
	}
}