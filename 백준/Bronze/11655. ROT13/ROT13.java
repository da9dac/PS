import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String s = br.readLine();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (!Character.isAlphabetic(c)) {
				sb.append(c);
				continue;
			}

			int x = c + 13;

			if (Character.isUpperCase(c)) {
				if (x > 'Z') x = 'A' + (x - 'Z' - 1);
			} else {
				if (x > 'z') x = 'a' + (x - 'z' - 1);
			}

			sb.append((char) x);
		}

		System.out.println(sb);
    }
}