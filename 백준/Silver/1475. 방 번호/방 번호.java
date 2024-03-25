import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String roomNumber = scanner.nextInt() + "";

		int[] count = new int[10];
		int max = 0;
		int sixOrNine = 0;
		int result = 0;

		for (int i = 0; i < roomNumber.length(); i++) {
			count[roomNumber.charAt(i) - '0']++;
		}

		for (int i = 0; i < count.length; i++) {
			if (i == 6 || i == 9) {
				continue;
			}
			max = Math.max(max, count[i]);
		}

		sixOrNine = count[6] + count[9];

		if (max * 2 < sixOrNine) {
			result = (int) Math.ceil(sixOrNine / 2.0);
		} else {
			result = max;
		}

		System.out.println(result);
	}
}