import java.io.*;
import java.util.*;

class Main {
    
    static int n, m, cnt, max = 0;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] map;
    static boolean[][] isVisited;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        map = new int[n][m];
        isVisited = new boolean[n][m];
        
        while(k-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            map[Integer.parseInt(st.nextToken())-1][Integer.parseInt(st.nextToken())-1] = 1;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) continue;
                if (isVisited[i][j]) continue;
                isVisited[i][j] = true;
                cnt = 1;
                dfs(i, j);
                max = Math.max(max, cnt);
            }
        }
        
        System.out.println(max);
    }
    
    static void dfs(int x, int y) {
        
        for (int dir = 0; dir < 4; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
            if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
            if (isVisited[nx][ny] || map[nx][ny] == 0) continue;
            
            isVisited[nx][ny] = true;
            cnt++;
            dfs(nx, ny);
        }
    }
}