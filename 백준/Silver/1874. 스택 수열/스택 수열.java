import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		Stack<Integer> stack = new Stack<>();

		int cur = 1;

		stack.push(cur++);
		sb.append("+").append("\n");

		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(br.readLine());

			while (stack.isEmpty() || stack.peek() != x) {
				if (cur > n) break;
				stack.push(cur++);
				sb.append("+").append("\n");
			}

			if (stack.peek() == x) {
				stack.pop();
				sb.append("-").append("\n");
			}
		}

		System.out.println(stack.isEmpty() ? sb : "NO");
	}
}
