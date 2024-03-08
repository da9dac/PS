import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int v = Integer.parseInt(str[2]);

		int day = (v - b) / (a - b);

		if( (v - b) % (a - b) != 0 ) {
			day++;
		}

		System.out.println(day);
    }
}