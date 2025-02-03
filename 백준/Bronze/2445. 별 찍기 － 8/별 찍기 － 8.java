import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int x = n * 2 - 1;
		int mx = x / 2;
		int y = n * 2;
		int my = y / 2;

		char[][] matrix = new char[x][y];

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i <= mx; i++) {
			for (int j = 0; j < my; j++) {
				if (j <= i) {
					matrix[i][j] = matrix[i][y - j - 1] = '*';
				} else {
					matrix[i][j] = matrix[i][y - j - 1] = ' ';
				}
			}
			sb.append(new String(matrix[i])).append("\n");
		}

		for (int i = mx + 1; i < x; i++) {
			for (int j = 0; j < my; j++) {
				if (j < x - i) {
					matrix[i][j] = matrix[i][y - j - 1] = '*';
				} else {
					matrix[i][j] = matrix[i][y - j - 1] = ' ';
				}
			}
			sb.append(new String(matrix[i])).append("\n");
		}

		System.out.println(sb);
	}
}