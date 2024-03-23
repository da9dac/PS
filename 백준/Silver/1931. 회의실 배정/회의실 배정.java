import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		int n = readInt();
		int[][] times = new int[n][2];

		for (int i = 0; i < n; i++) {

			times[i][0] = readInt();
			times[i][1] = readInt();
		}

		Arrays.sort(times, (o1, o2) -> o1[1] != o2[1] ? o1[1] - o2[1] : o1[0] - o2[0]);

		int min = -1;
		int count = 0;

		for (int i = 0; i < n; i++) {
			int s = times[i][0];
			int e = times[i][1];

			if (min <= s) {
				count++;
				min = e;
			}
		}

		System.out.println(count);
	}

	private static int readInt() throws IOException {
		int sum = 0;
		boolean isNegative = false;
		while(true){
			int input = System.in.read();
			if(input=='\n' || input==' ')
				return isNegative ? sum*-1 : sum;
			else if(input=='-')
				isNegative = true;
			else
				sum = (sum*10)+input-'0';
		}
	}
}