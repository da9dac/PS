import java.io.*;
import java.util.*;

class Main {
    
    static int r, c, s = 0, w = 0, sc, wc;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static char[][] map;
    static boolean[][] isVisited;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        
        map = new char[r][c];
        isVisited = new boolean[r][c];
        
        for (int i = 0; i < r; i++) {
            String input = br.readLine();
            
            for (int j = 0; j < c; j++) {
                map[i][j] = input.charAt(j);
            }
        }
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                char ch = map[i][j];
                if (ch == '#' || isVisited[i][j]) continue;
                isVisited[i][j] = true;
                sc = 0;
                wc = 0;
                dfs(i, j);
                if (sc > wc) s += sc;
                else w += wc;
            }
        }
        
        System.out.println(s + " " + w);
    }
    
    static void dfs(int x, int y) {
        isVisited[x][y] = true;
        
        if (map[x][y] == 'o') sc++;
        if (map[x][y] == 'v') wc++;
        
        for (int dir = 0; dir < 4; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
            if (nx < 0 || ny < 0 || nx >= r || ny >= c) continue;
            if (isVisited[nx][ny] || map[nx][ny] == '#') continue;
            
            dfs(nx, ny);
        }
    }
}