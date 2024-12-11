import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            
            int[][] map = new int[m][n];
            
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            
            int cnt = 0;
            
            for (int i = 0; i < n; i++) {
                for (int j = m - 2; j >= 0; j--) {
                    if (map[j][i] == 0) continue;
                    
                    int line = j;
                    for (int k = j + 1; k < m; k++) {
                        int x = map[k][i];
                        if (x == 0) {
                            line = k;
                            cnt++;
                        } else {
                            break;
                        }
                    }
                    
                    map[j][i] = 0;
                    map[line][i] = 1;
                }
            }
            
            sb.append(cnt).append("\n");
        }
        
        System.out.println(sb);
    }
}