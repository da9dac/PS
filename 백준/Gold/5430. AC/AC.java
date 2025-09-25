import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		Deque<Integer> deque = new ArrayDeque<>();

		while (t-- > 0) {
			char[] functions = br.readLine().toCharArray();
			int n = Integer.parseInt(br.readLine());
			String input = br.readLine();
			String[] integers = input.substring(1, input.length() - 1).split(",");
			boolean isLeft = true;
			boolean isError = false;

			if (n != 0) {
				for (String integer : integers) deque.offer(Integer.parseInt(integer));
			}

			for (char function : functions) {
				if (function == 'R') {
					isLeft = !isLeft;
					continue;
				}

				if (deque.isEmpty()) {
					isError = true;
					break;
				}

				if (isLeft) deque.pollFirst();
				else deque.pollLast();
			}

			if (isError) {
				sb.append("error").append("\n");
				continue;
			}
			
			if (isLeft) {
				sb.append("[").append(!deque.isEmpty() ? deque.pollFirst() : "");
				while (!deque.isEmpty()) sb.append(",").append(deque.pollFirst());
				sb.append("]").append("\n");
			} else {
				sb.append("[").append(!deque.isEmpty() ? deque.pollLast() : "");
				while (!deque.isEmpty()) sb.append(",").append(deque.pollLast());
				sb.append("]").append("\n");
			}
		}

		System.out.println(sb);
	}
}