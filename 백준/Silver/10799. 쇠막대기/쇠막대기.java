import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] input = br.readLine().toCharArray();

		Stack<Character> stack = new Stack<>();

		int count = 0;

		for (int i = 0; i < input.length; i++) {
			if (input[i] == '(') {
				stack.push(input[i]);
			} else if (input[i - 1] == '(' && input[i] == ')'){
				stack.pop();
				count += stack.size();
			} else {
				stack.pop();
				count++;
			}
		}

		System.out.println(count);
	}
}