import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[][] table = new int[r + 1][c];
        
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        int cnt = 0;
      int idx = 0;

      for (int i = 1; i <= r; i++) {
         for (int j = 0; j < c; j++) {
            int front = table[i - 1][j];
            if (i > 1 && front == 0) {
               continue;
            }
            for (int cur = idx; cur < n; cur++) {
               if (arr[cur] > front) {
                  table[i][j] = arr[cur];
                  idx = cur + 1;
                  cnt++;
                  break;
               }
            }

            if (idx >= n) {
               continue;
            }
         }
      }

      System.out.println(cnt);
    }
}