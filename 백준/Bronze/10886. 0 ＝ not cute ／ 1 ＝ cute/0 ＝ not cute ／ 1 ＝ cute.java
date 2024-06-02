import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int cute = 0;

		String yes = "Junhee is cute!";
		String no = "Junhee is not cute!";

		while (n-- > 0) {
			if (Integer.parseInt(br.readLine()) == 1) cute++;
			else cute--;
		}

		System.out.println(cute > 0 ? yes : no);
	}
}