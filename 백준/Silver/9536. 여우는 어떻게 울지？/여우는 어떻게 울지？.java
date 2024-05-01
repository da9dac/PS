import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			String[] says = br.readLine().split(" ");

			while (true) {
				String animals = br.readLine();
				if (animals.equals("what does the fox say?")) break;

				String sound = animals.split(" ")[2];

				for (int i = 0; i < says.length; i++) {
					if (says[i].equals(sound)) says[i] = "";
				}
			}

			for (String say : says) {
				if (!say.isEmpty()) sb.append(say).append(" ");
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}
}