import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int mid = m / 2;
        
        char[][] arr = new char[n][m];
        
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < mid; j++) {
                char tmp = arr[i][m - 1 - j];
                arr[i][m - 1 - j] = arr[i][j];
                arr[i][j] = tmp;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (char[] a : arr) {
            sb.append(new String(a)).append("\n");
        }
        
        System.out.println(sb);
    }
}