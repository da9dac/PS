import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println(Integer.toBinaryString(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine())).length());
	}
}