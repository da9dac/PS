import java.io.*;
import java.util.*;
import java.math.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		BigInteger x = new BigInteger(st.nextToken(), 2);
		BigInteger y = new BigInteger(st.nextToken(), 2);

		System.out.println(x.add(y).toString(2));
	}
}