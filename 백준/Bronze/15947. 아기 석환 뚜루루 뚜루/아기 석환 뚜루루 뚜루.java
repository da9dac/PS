import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] words = {
			"baby", "sukhwan", "tururu", "turu",
			"very", "cute", "tururu", "turu",
			"in", "bed", "tururu", "turu",
			"baby", "sukhwan"
		};

		int n = Integer.parseInt(br.readLine()) - 1;

		int cycle = n / 14;
		int idx = n % 14;

		String word = words[idx];

		if (word.equals("tururu") || word.equals("turu")) {
			int ruCount;
			
			if (word.equals("tururu")) {
				ruCount = 2 + cycle;
			} else {
				ruCount = 1 + cycle;
			}

			if (ruCount >= 5) {
				System.out.println("tu+ru*" + ruCount);
			} else {
				StringBuilder sb = new StringBuilder("tu");
				for (int i = 0; i < ruCount; i++) {
					sb.append("ru");
				}
				System.out.println(sb);
			}
		} else {
			System.out.println(word);
		}
	}
}
