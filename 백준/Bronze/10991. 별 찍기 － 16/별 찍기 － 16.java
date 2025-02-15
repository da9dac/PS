import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        int x = n;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < x - 1; j++) {
				sb.append(" ");
			}

			for (int j = x; j <= x + i; j++) {
				sb.append("*").append(" ");
			}

			sb.append("\n");

			x--;
		}
        
        System.out.println(sb);
    }
}