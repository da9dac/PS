import java.io.*;

public class Main {

	static int n, m, maxSize;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int[][] uses;
	static char[][] board = new char[3][3];
	static boolean[][] isUsed;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] input = br.readLine().split(" ");

		n = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);
		maxSize = 2 * m - 1;

		for (int i = 0; i < 3; i++) {
			char[] chs = br.readLine().toCharArray();
			for (int j = 0; j < 3; j++) {
				board[i][j] = chs[j];
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				char c = board[i][j];
				if (!Character.isDigit(c)) continue;
				isUsed = new boolean[3][3];
				uses = new int[maxSize][2];

				isUsed[i][j] = true;

				uses[0][0] = i;
				uses[0][1] = j;

				if (dfs(i, j, c - '0', 1, 0)) {
					sb.append(1).append("\n");
					for (int[] use : uses) {
						sb.append(use[0]).append(" ").append(use[1]).append("\n");
					}
					System.out.println(sb);
					return;
				}
			}
		}

		System.out.print(0);
	}

	static boolean dfs(int x, int y, int sum, int size, int pm) {
		if (size == maxSize) {
			return sum == n;
		}

		for (int dir = 0; dir < 4; dir++) {
			int nx = x + dx[dir];
			int ny = y + dy[dir];

			if (nx < 0 || ny < 0 || nx >= 3 || ny >= 3) continue;
			if (isUsed[nx][ny]) continue;

			char c = board[nx][ny];

            isUsed[nx][ny] = true;
			uses[size][0] = nx;
			uses[size][1] = ny;

			if (pm != 0) {
				int cur = pm * (c - '0');
				if (dfs(nx, ny, sum + cur, size + 1, 0)) return true;
			} else {
				if (dfs(nx, ny, sum, size + 1, c == '-' ? -1 : 1)) return true;
			}
            
            isUsed[nx][ny] = false;
		}

		return false;
	}
}