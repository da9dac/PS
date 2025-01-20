import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        int[][] board = new int[5][5];
        boolean[][] isVisited = new boolean[5][5];
        
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            
            for (int j = 0; j < 5; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        Queue<Student> q = new ArrayDeque<>();
        
        st = new StringTokenizer(br.readLine());
        
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        q.offer(new Student(r, c, 0));
        isVisited[r][c] = true;
        
        while (!q.isEmpty()) {
            Student cur = q.poll();
            
            for (int dir = 0; dir < 4; dir++) {
                int nx = cur.x + dx[dir];
                int ny = cur.y + dy[dir];
                
                if (nx < 0 || ny < 0 || nx >= 5 || ny >= 5) continue;
                
                int n = board[nx][ny];
                
                if (isVisited[nx][ny] || n == -1) continue;
                if (n == 1) {
                    System.out.println(cur.move + 1);
                    return;
                }
                
                q.offer(new Student(nx, ny, cur.move + 1));
                isVisited[nx][ny] = true;
            }
        }
        
        System.out.println(-1);
    }
    
    static class Student {
        int x;
        int y;
        int move;
        
        Student(int x, int y, int move) {
            this.x = x;
            this.y = y;
            this.move = move;
        }
    }
}