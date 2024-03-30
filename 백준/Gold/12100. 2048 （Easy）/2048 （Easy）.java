import java.io.*;
import java.util.*;

class Main {
    
    static int n, max = 0;
	static int[] move = new int[5];
	static int[][] board, newBoard;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		board = new int[n][n];
		newBoard = new int[n][n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < n; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
				newBoard[i][j] = board[i][j];
			}
		}

		solve(0);

		System.out.println(max);
	}

	static void solve(int cnt) {
		if (cnt == 5) {
			for (int i = 0; i < 5; i++) {
				move(move[i]);
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					max = Math.max(max, board[i][j]);
				}
			}
			back();
			return;
		}

		for (int dir = 0; dir < 4; dir++) {
			move[cnt] = dir;
			solve(cnt + 1);
		}
	}

	static void move(int dir) {
		switch(dir) {
			case 0: {
				right();
				break;
			}
			case 1: {
				left();
				break;
			}
			case 2: {
				up();
				break;
			}
			default: {
				down();
				break;
			}
		}
	}

	static void right() {
		for (int i = 0; i < n; i++) { // 각 줄의
			for (int j = n - 1; j >= 0; j--) { // 오른쪽 끝부터
				for (int k = j - 1; k >= 0; k--) { // 왼쪽에서 처음 만나는 요소가 0이 아닐 때까지
					if (board[i][k] != 0) {
						if (board[i][j] == 0) {
							board[i][j] = board[i][k];
							board[i][k] = 0;
							continue;
						}

						if (board[i][j] == board[i][k]) {
							board[i][j] *= 2;
							board[i][k] = 0;
						}

						break;
					}
				}
			}
		}
	}

	static void left() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (board[i][k] != 0) {
						if (board[i][j] == 0) {
							board[i][j] = board[i][k];
							board[i][k] = 0;
							continue;
						}

						if (board[i][j] == board[i][k]) {
							board[i][j] *= 2;
							board[i][k] = 0;
						}
						break;
					}
				}
			}
		}
	}

	static void up() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (board[k][i] != 0) {
						if (board[j][i] == 0) {
							board[j][i] = board[k][i];
							board[k][i] = 0;
							continue;
						}

						if (board[j][i] == board[k][i]) {
							board[j][i] *= 2;
							board[k][i] = 0;
						}
						break;
					}
				}
			}
		}
	}

	static void down() {
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= 0; j--) {
				for (int k = j - 1; k >= 0; k--) {
					if (board[k][i] != 0) {
						if (board[j][i] == 0) {
							board[j][i] = board[k][i];
							board[k][i] = 0;
							continue;
						}

						if (board[j][i] == board[k][i]) {
							board[j][i] *= 2;
							board[k][i] = 0;
						}
						break;
					}
				}
			}
		}
	}

	static void back() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = newBoard[i][j];
			}
		}
	}
}