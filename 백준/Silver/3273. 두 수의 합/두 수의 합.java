import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(br.readLine());
		int cnt = 0;

		int[] nums = new int[n];
		boolean[] arr = new boolean[2000001];

		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < n; i++) {
			int currentNumber = nums[i];
			int targetNumber = x - currentNumber;

			if (targetNumber >= 1 && arr[targetNumber]) {
				cnt++;
			}

			arr[currentNumber] = true;
		}

		System.out.println(cnt);
	}
}