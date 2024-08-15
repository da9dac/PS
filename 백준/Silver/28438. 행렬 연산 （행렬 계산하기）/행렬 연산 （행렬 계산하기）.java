import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      int q = Integer.parseInt(st.nextToken());
      int[][] arr = new int[n][m];
      int[] sumX = new int[n];
      int[] sumY = new int[m];
      while (q-- > 0) {
         st = new StringTokenizer(br.readLine());
         int x = Integer.parseInt(st.nextToken());
         int y = Integer.parseInt(st.nextToken()) - 1;
         int z = Integer.parseInt(st.nextToken());
         if (x == 1) sumX[y] += z;
         else sumY[y] += z;
      }
      for (int i = 0; i < n; i++) {
         int sum = sumX[i];
         if (sum == 0) continue;
         for (int j = 0; j < m; j++) arr[i][j] = sum;
      }
      for (int i = 0; i < m; i++) {
         int sum = sumY[i];
         if (sum == 0) continue;
         for (int j = 0; j < n; j++) arr[j][i] += sum;
      }
      StringBuilder sb = new StringBuilder();
      for (int[] a : arr) {
         for (int x : a) sb.append(x).append(" ");
         sb.append("\n");
      }
      System.out.println(sb);
   }
}