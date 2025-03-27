import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n = Long.parseLong(br.readLine());
        
		StringBuilder binary = new StringBuilder(Long.toBinaryString(n));
		binary.reverse();
        
		System.out.println(Long.parseLong(binary.toString(), 2));
	}
}