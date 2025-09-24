import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		Queue q = new Queue(n);

		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());

			String cmd = st.nextToken();

			switch (cmd) {
				case "push": {
					q.push(Integer.parseInt(st.nextToken()));
					break;
				}
				case "pop": {
					sb.append(q.pop()).append("\n");
					break;
				}
				case "size": {
					sb.append(q.size()).append("\n");
					break;
				}
				case "empty": {
					sb.append(q.empty()).append("\n");
					break;
				}
				case "front": {
					sb.append(q.front()).append("\n");
					break;
				}
				default: {
					sb.append(q.back()).append("\n");
				}
			}
		}

		System.out.println(sb);
	}

	static class Queue {
		int[] arr;
		int front;
		int back;

		Queue(int size) {
			this.arr = new int[size];
			this.front = 0;
			this.back = 0;
		}

		void push(int x) {
			arr[back++] = x;
		}

		int pop() {
			return empty() == 1 ? -1 : arr[front++];
		}

		int size() {
			return back - front;
		}

		int empty() {
			return size() == 0 ? 1 : 0;
		}

		int front() {
			return empty() == 1 ? -1 : arr[front];
		}

		int back() {
			return empty() == 1 ? -1 : arr[back - 1];
		}
	}
}