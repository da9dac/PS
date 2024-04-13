import java.io.*;

public class Main {

	static int tx = 0, ty = 0, cnt = 81, min = 10;
	static int[][] map = new int[9][9];
	static boolean[][] isUsedX = new boolean[9][10];
	static boolean[][] isUsedY = new boolean[9][10];
	static boolean[][] isUsedTT = new boolean[10][10];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input;

		for (int i = 0; i < 9; i++) {
			input = br.readLine().split("");
			for (int j = 0; j < 9; j++) {
				int num = Integer.parseInt(input[j]);
				map[i][j] = num;
				if (num != 0) {
					cnt--;
					isUsedX[i][num] = true;
					isUsedY[j][num] = true;
					isUsedTT[getTT(i, j)][num] = true;
				} else {
					tx = i;
					ty = j;
				}
			}
		}

		solve(0, 0);

		System.out.println(sb);
	}

	static boolean solve(int x, int y) {
		if (x == 9) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(map[i][j]);
				}
				sb.append("\n");
			}
			return true;
		}

		if (map[x][y] != 0) {
			if (y == 8) {
				if (solve(x + 1, 0)) return true;
			}
			else {
				if(solve(x, y + 1)) return true;
			}
		} else {
			for (int i = 1; i <= 9; i++) {
				int tt = getTT(x, y);
				if (isUsedX[x][i] || isUsedY[y][i] || isUsedTT[tt][i]) {
					continue;
				}

				isUsedX[x][i] = true;
				isUsedY[y][i] = true;
				isUsedTT[tt][i] = true;
				map[x][y] = i;

				if (y == 8) {
					if (solve(x + 1, 0)) return true;
				}
				else {
					if(solve(x, y + 1)) return true;
				}

				map[x][y] = 0;
				isUsedX[x][i] = false;
				isUsedY[y][i] = false;
				isUsedTT[tt][i] = false;
			}
		}

		return false;
	}

	static int getTT(int i, int j) {
		if (i < 3) {
			if (j < 3) return 1;
			else if (j < 6) return 2;
			else return 3;
		} else if (i < 6) {
			if (j < 3) return 4;
			else if (j < 6) return 5;
			else return 6;
		} else {
			if (j < 3) return 7;
			else if (j < 6) return 8;
			else return 9;
		}
	}
}