import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		double c = Double.parseDouble(st.nextToken());

		st = new StringTokenizer(br.readLine());

		double i = Double.parseDouble(st.nextToken());
		double j = Double.parseDouble(st.nextToken());
		double k = Double.parseDouble(st.nextToken());

		double t = Math.min(Math.min(a / i, b / j), c / k);

		a = a - i * t;
		b = b - j * t;
		c = c - k * t;

		System.out.println(a + " " + b + " " + c);
	}
}