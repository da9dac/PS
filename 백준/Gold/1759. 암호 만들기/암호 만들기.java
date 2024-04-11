import java.io.*;
import java.util.*;

class Main {
    
    static int l, c;
	static char[] chars, password;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		l = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		password = new char[l];
		chars = new char[c];

		for (int i = 0; i < c; i++) {
			chars[i] = st.nextToken().charAt(0);
		}

		Arrays.sort(chars);

		solve(0, 0, 0, 0);

		System.out.println(sb);
	}

	static void solve(int size, int start, int vo, int co) {
		if (size == l) {
			if (vo > 0 && co > 1) sb.append(new String(password)).append("\n");
			return;
		}

		for (int i = start; i < c; i++) {
			password[size] = chars[i];
			
			boolean isVowel = isVowel(chars[i]);
			int nv = isVowel ? vo + 1 : vo;
			int nc = !isVowel ? co + 1 : co;

			solve(size + 1, i + 1, nv, nc);
		}
	}

	static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
}