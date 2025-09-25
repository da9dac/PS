import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		Deque deque = new Deque(n);

		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());

			String cmd = st.nextToken();

			switch (cmd) {
				case "push_front": {
					deque.push_front(Integer.parseInt(st.nextToken()));
					break;
				}
				case "push_back": {
					deque.push_back(Integer.parseInt(st.nextToken()));
					break;
				}
				case "pop_front": {
					sb.append(deque.pop_front()).append("\n");
					break;
				}
				case "pop_back": {
					sb.append(deque.pop_back()).append("\n");
					break;
				}
				case "size": {
					sb.append(deque.size()).append("\n");
					break;
				}
				case "empty": {
					sb.append(deque.empty()).append("\n");
					break;
				}
				case "front": {
					sb.append(deque.front()).append("\n");
					break;
				}
				default: {
					sb.append(deque.back()).append("\n");
				}
			}
		}

		System.out.println(sb);
	}

	static class Deque {
		int[] arr;
		int left;
		int right;

		Deque(int size) {
			this.arr = new int[size * 2];
			this.left = size - 1;
			this.right = size;
		}

		void push_front(int x) {
			arr[left--] = x;
		}

		void push_back(int x) {
			arr[right++] = x;
		}

		int pop_front() {
			return empty() == 1 ? -1 : arr[++left];
		}

		int pop_back() {
			return empty() == 1 ? -1 : arr[--right];
		}

		int size() {
			return right - left - 1;
		}

		int empty() {
			return size() == 0 ? 1 : 0;
		}

		int front() {
			return empty() == 1 ? - 1 : arr[left + 1];
		}

		int back() {
			return empty() == 1 ? - 1 : arr[right - 1];
		}
	}
}