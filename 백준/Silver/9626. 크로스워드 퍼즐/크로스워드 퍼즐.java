import java.util.*;
import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int u = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        
        int x = m + u + d;
        int y = n + l + r;
        int next = 0;
        
        char[][] result = new char[x][y];
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < u; i++) {
            next = i % 2 == 0 ? 0 : 1;
            
            for (int j = 0; j < y; j++) {
                result[i][j] = next % 2 == 0 ? '#' : '.';
                next++;
            }
        }
        
        for (int i = u; i < u + m; i++) {
            next = i % 2 == 0 ? 0 : 1;
            
            for (int j = 0; j < l; j++) {
                result[i][j] = next % 2 == 0 ? '#' : '.';
                next++;
            }
            
            String s = br.readLine();
            int idx = 0;
            
            for (int j = l; j < l + n; j++) {
                result[i][j] = s.charAt(idx++);
                next++;
            }
            
            for (int j = l + n; j < y; j++) {
                result[i][j] = next % 2 == 0 ? '#' : '.';
                next++;
            }
        }
        
        for (int i = u + m; i < x; i++) {
            next = i % 2 == 0 ? 0 : 1;
            
            for (int j = 0; j < y; j++) {
                result[i][j] = next % 2 == 0 ? '#' : '.';
                next++;
            }
        }
        
        for (char[] arr : result) {
            sb.append(new String(arr)).append("\n");
        }
        
        System.out.println(sb);
    }
}