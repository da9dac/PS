import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String expression = br.readLine();
		Stack<Character> stack = new Stack<>();

		int cnt = 0;

		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);

			if (c == '(') {
				stack.push(c);
				continue;
			}

			stack.pop();

			cnt += expression.charAt(i - 1) == '(' ? stack.size() : 1;
		}

		System.out.println(cnt);
	}
}