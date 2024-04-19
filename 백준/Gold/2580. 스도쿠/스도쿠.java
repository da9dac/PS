import java.io.*;
import java.util.*;

class Main {
    
    static int[][] board = new int[9][9];
	static boolean[][] isUsedX = new boolean[9][10];
	static boolean[][] isUsedY = new boolean[9][10];
	static boolean[][] isUsedTT = new boolean[9][10];

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				int num = Integer.parseInt(st.nextToken());
				board[i][j] = num;
				isUsedX[i][num] = true;
				isUsedY[j][num] = true;
				isUsedTT[getTT(i, j)][num] = true;
			}
		}

		sudoku(0, 0);

		System.out.println(sb);
	}

	static boolean sudoku(int x, int y) {
		if (x == 9) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(board[i][j]).append(" ");
				}
				sb.append("\n");
			}

			return true;
		}

		if (board[x][y] != 0) {
			if (y == 8) {
				if (sudoku(x + 1, 0)) return true;
			} else {
				if (sudoku(x, y + 1)) return true;
			}
		} else {
			for (int i = 1; i <= 9; i++) {
				int tt = getTT(x, y);

				if (isUsedX[x][i] || isUsedY[y][i] || isUsedTT[tt][i]) continue;

				board[x][y] = i;
				isUsedX[x][i] = true;
				isUsedY[y][i] = true;
				isUsedTT[tt][i] = true;

				if (y == 8) {
					if (sudoku(x + 1, 0)) return true;
				} else {
					if (sudoku(x, y + 1)) return true;
				}

				board[x][y] = 0;
				isUsedX[x][i] = false;
				isUsedY[y][i] = false;
				isUsedTT[tt][i] = false;
			}
		}

		return false;
	}

	static int getTT(int x, int y) {
		if (x < 3) {
			if (y < 3) return 0;
			if (y < 6) return 1;
			return 2;
		}

		if (x < 6) {
			if (y < 3) return 3;
			if (y < 6) return 4;
			return 5;
		}

		if (y < 3) return 6;
		if (y < 6) return 7;
		return 8;
	}
}