import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack<Character> stack = new Stack<>();

		int n = Integer.parseInt(br.readLine());
		int cnt = 0;

		while (n-- > 0) {
			String word = br.readLine();

			for (int i = 0; i < word.length(); i++) {
				char cur = word.charAt(i);

				if (stack.isEmpty()) {
					stack.push(cur);
					continue;
				}

				char prev = stack.peek();

				if (prev == cur) stack.pop();
				else stack.push(cur);
			}

			if (stack.isEmpty()) cnt++;

			stack.clear();
		}

		System.out.println(cnt);
	}
}