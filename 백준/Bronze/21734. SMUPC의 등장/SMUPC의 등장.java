import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		int len = s.length();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			String x = Integer.toString(c);
			int sum = 0;

			for (int j = 0; j < x.length(); j++) {
				sum += x.charAt(j) - '0';
			}

			for (int j = 0; j < sum; j++) {
				sb.append(c);
			}

			sb.append("\n");
		}

		System.out.println(sb);
	}
}