import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int m = n * 2 - 1;
		int mid = m / 2;

		StringBuilder sb = new StringBuilder();


		for (int i = 0; i < mid; i++) {
			sb.append(" ");
		}

		sb.append("*").append("\n");

		for (int i = 1; i< n; i++) {
			for (int j = 0; j < mid - i; j++) {
				sb.append(" ");
			}
			sb.append("*");
			for (int j = mid - i + 1; j < mid + i; j++) {
				sb.append(" ");
			}
			sb.append("*").append("\n");
		}

		System.out.println(sb);
    }
}