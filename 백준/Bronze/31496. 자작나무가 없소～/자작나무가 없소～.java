import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken()), result = 0;
		String word = st.nextToken();

		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());

			String[] items = st.nextToken().split("_");
			int cnt = Integer.parseInt(st.nextToken());

			for (String item : items) {
				if (item.equals(word)) {
					result += cnt;
					break;
				}
			}
		}

		System.out.println(result);
	}
}