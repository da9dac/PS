import java.io.*;
import java.util.*;

class Main {
    
    static int k, end;
	static long max = 0, min = Long.MAX_VALUE;
	static String maxStr = "", minStr = "";
	static String[] sign;
	static char[] nums;
	static boolean[] isUsedSign;
	static boolean[] isUsedNum = new boolean[10];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		k = Integer.parseInt(br.readLine());
		end = k + 1;

		sign = new String[k];
		isUsedSign = new boolean[k];
		nums = new char[end];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < k; i++) {
			sign[i] = st.nextToken();
		}

		solve(0);

		System.out.println(maxStr + "\n" + minStr);
	}

	static void solve(int size) {
		if (size == end) {
			String s = new String(nums);
			long num = Long.parseLong(s);
			if (max < num) {
				maxStr = s;
				max = num;
			}
			if (min > num) {
				minStr = s;
				min = num;
			}
			return;
		}

		for (int i = 0; i < 10; i++) {
			if (isUsedNum[i]) continue;

			if (size == 0) {
				isUsedNum[i] = true;
				nums[size] = (char)(i + '0');
				solve(size + 1);
				isUsedNum[i] = false;
			}
			else {
				if (isSatisfied(size, i)) {
					isUsedNum[i] = true;
					nums[size] = (char)(i + '0');
					solve(size + 1);
					isUsedNum[i] = false;
				}
			}
		}
	}

	static boolean isSatisfied(int size, int y) {
		int x = nums[size - 1] - '0';
		return (sign[size - 1].equals(">") && x > y) || (sign[size - 1].equals("<") && x < y);
	}
}