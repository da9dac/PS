import java.io.*;
import java.util.*;

class Main {
    
    static int n, plus, minus, multi, div, max = -1000000001, min = 1000000001;
	static int[] arr;
	static char[] ops;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		ops = new char[n - 1];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		plus = Integer.parseInt(st.nextToken());
		minus = Integer.parseInt(st.nextToken());
		multi = Integer.parseInt(st.nextToken());
		div = Integer.parseInt(st.nextToken());

		solve(0);

		System.out.println(max + "\n" + min);
	}

	static void solve(int size) {
		if (size == n) {
			calcurate();
			return;
		}

		if (size == 0) {
			solve(size + 1);
		} else {
			if (plus != 0) {
				plus--;
				ops[size - 1] = '+';
				solve(size + 1);
				plus++;
			}

			if (minus != 0) {
				minus--;
				ops[size - 1] = '-';
				solve(size + 1);
				minus++;
			}

			if (multi != 0) {
				multi--;
				ops[size - 1] = '*';
				solve(size + 1);
				multi++;
			}

			if (div != 0) {
				div--;
				ops[size - 1] = '/';
				solve(size + 1);
				div++;
			}
		}
	}

	static void calcurate() {
		int result = 0;

		Stack<Integer> s = new Stack<>();

		s.push(arr[0]);

		for (int i = 0; i < n - 1; i++) {
			switch (ops[i]) {
				case '+': {
					s.push(arr[i + 1]);
					break;
				}
				case '-': {
					s.push(arr[i + 1] * -1);
					break;
				}
				case '*': {
					s.push(s.pop() * arr[i + 1]);
					break;
				}
				default: {
					s.push(s.pop() / arr[i + 1]);
					break;
				}
			}
		}

		while (!s.isEmpty()) {
			result += s.pop();
		}

		max = Math.max(max, result);
		min = Math.min(min, result);
	}
}