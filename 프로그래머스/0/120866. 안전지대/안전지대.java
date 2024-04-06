import java.util.ArrayList;
class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int safe = n * n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    safe--;
                    for (int p = i - 1; p <= i + 1; p++) {
                        if (p < 0 || p >= n) continue;
                        
                        for (int q = j - 1; q <= j + 1; q++) {
                            if (q < 0 || q >= n) continue;
                            
                            if (board[p][q] == 0) {
                                safe--;
                                board[p][q] = 2;
                            }
                        }
                    }
                }
            }
        }

        return safe;
    }
}