import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String line;

		Stack<Character> stack = new Stack<>();

		while (!(line = br.readLine()).equals(".")) {

			char[] chars = line.toCharArray();

			for (char c : chars) {
				if (c == '[' || c == '(') {
					stack.push(c);
				} else if (c == ']') {
					if (stack.isEmpty() || stack.peek() != '[') {
						sb.append("no").append("\n");
						break;
					}
					stack.pop();
				} else if (c == ')') {
					if (stack.isEmpty() || stack.peek() != '(') {
						sb.append("no").append("\n");
						break;
					}
					stack.pop();
				} else if (c == '.') {
					if (!stack.isEmpty()) {
						sb.append("no").append("\n");
						break;
					}
					sb.append("yes").append("\n");
				}
			}

			stack.clear();
		}

		System.out.println(sb);
	}
}