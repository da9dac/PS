import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Set<String> set = new HashSet<>();

		String str = br.readLine();

		int length = str.length();
		int cnt = length / 3;

		int p = 13;
		int k = 13;
		int h = 13;
		int t = 13;

		for (int i = 0; i < length - 2; i += 3) {
			set.add(str.substring(i, i + 3));
		}

		if (set.size() != cnt) {
			sb.append("GRESKA");
		}
		else {
			for (String s : set) {
				switch (s.charAt(0)) {
					case 'P': {
						p--;
						break;
					}
					case 'K': {
						k--;
						break;
					}
					case 'H': {
						h--;
						break;
					}
					default: {
						t--;
						break;
					}
				}
			}
			sb.append(p).append(" ").append(k).append(" ").append(h).append(" ").append(t);
		}

		System.out.println(sb);
	}
}