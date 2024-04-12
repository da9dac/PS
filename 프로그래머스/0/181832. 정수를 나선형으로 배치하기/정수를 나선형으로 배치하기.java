class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int num = 1;
        int end = n * n;
        int x = 0, y = 0;
        
        int dir = 0;
        
        for (int i = 1; i <= end; i++) {
            answer[x][y] = i;
            
            int nx = x;
            int ny = y;
            
            if (dir == 0) {
                ny++;
            } else if (dir == 1) {
                nx++;
            } else if (dir == 2) {
                ny--;
            } else {
                nx--;
            }
            
            if(nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
                dir++;
            }
            
            if (dir > 3) dir = 0;
            
            if (dir == 0) {
                y++;
            } else if (dir == 1) {
                x++;
            } else if (dir == 2) {
                y--;
            } else {
                x--;
            }
        }
        
        return answer;
    }
}