import java.io.*;

 class Main {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int m = n * 2 - 1;
		int mid = n - 1;

		for (int i = 0; i < mid; i++) {
			sb.append(" ");
		}

		sb.append("*").append("\n");

		int l = mid - 1;
		int r = mid + 1;

		for (int i = 1; i < n - 1; i++) {
			for (int j = 0; j < l; j++) {
				sb.append(" ");
			}
			sb.append("*");
			for (int j = l + 1; j < r; j++) {
				sb.append(" ");
			}
			sb.append("*").append("\n");
			l--;
			r++;
		}

		if (n != 1) for (int i = 0; i < m; i++) sb.append("*");
         
         System.out.println(sb);
     }
}