import java.io.*;
import java.util.*;

class Main {
	static int n;
	static List<Binary> binaries = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		String binary = br.readLine();

		char[] nums = new char[n];

		makeNums(0, nums);

		Collections.sort(binaries);

		int cnt = 0;

		for (Binary b : binaries) {
			if (b.str.equals(binary)) {
				break;
			}
			cnt++;
		}

		System.out.println(cnt);
	}

	static void makeNums(int size, char[] nums) {
		if (size == n) {
			binaries.add(new Binary(nums));
			return;
		}

		nums[size] = '0';
		makeNums(size + 1, nums);
		nums[size] = '1';
		makeNums(size + 1, nums);
	}

	static void init(char[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = '0';
		}
	}

	static class Binary implements Comparable<Binary> {
		char[] nums;
		String str;
		int value;
		int cnt;

		Binary(char[] nums) {
			this.nums = nums;
			this.str = String.valueOf(nums);
			setValue();
			setCount();
		}

		@Override
		public int compareTo(Binary o) {
			return this.cnt != o.cnt ? this.cnt - o.cnt : this.value - o.value;
		}

		private void setValue() {
			this.value = Integer.parseInt(String.valueOf(reverse()), 2);
		}

		private void setCount() {
			for (char num : nums) {
				if (num == '1') cnt++;
			}
		}

		private char[] reverse() {
			char[] newNums = nums.clone();

			for (int i = 0; i < newNums.length / 2; i++) {
				char tmp = newNums[i];
				newNums[i] = newNums[newNums.length - 1 - i];
				newNums[newNums.length - 1 - i] = tmp;
			}

			return newNums;
		}
	}
}