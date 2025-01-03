import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());

			double sum = 0.0;

			while (st.hasMoreTokens()) {
				String x = st.nextToken();
				
				switch (x) {
					case "@": {
						sum *= 3;
						break;
					}
					case "%": {
						sum += 5;
						break;
					}
					case "#": {
						sum -= 7;
						break;
					}
					default: {
						sum += Double.parseDouble(x);
					}
				}
			}
			
			sb.append(String.format("%.2f", sum)).append("\n");
		}

		System.out.println(sb);
	}
}