import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String h = br.readLine();
		String n = br.readLine();

		int x = h.length();
		int y = n.length();

		int cnt = 0;

		for (int i = 0; i <= x - y; i++) {
			String s = h.substring(i, i + y);

			if (s.equals(n)) cnt++;
		}

		System.out.println(cnt);
	}
}