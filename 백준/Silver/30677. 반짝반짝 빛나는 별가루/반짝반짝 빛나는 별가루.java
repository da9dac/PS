import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());

      int n = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      int r = Integer.parseInt(st.nextToken());
      int f = 0;
      int combo = 0;

      int[] cnt = new int[k];
      int[] base = new int[k];
      int[] s = new int[k];
      int[] p = new int[k];

      st = new StringTokenizer(br.readLine());

      for (int i = 0; i < k; i++) {
         base[i] = Integer.parseInt(st.nextToken());
      }

      st = new StringTokenizer(br.readLine());

      for (int i = 0; i < k; i++) {
         s[i] = Integer.parseInt(st.nextToken());
      }

      st = new StringTokenizer(br.readLine());

      for (int i = 0; i < k; i++) {
         p[i] = Integer.parseInt(st.nextToken());
      }

      long result = 0;

      for (int i = 0; i < n; i++) {
         int l = Integer.parseInt(br.readLine()) - 1;

         if (l == -1) {
            f = f < r ? 0 : f - r;
            combo = 0;
            continue;
         }

         f += p[l];

         if (f > 100) {
            result = -1;
            break;
         }

         long x = 100 + (long)combo * c;
         long y = 100 + (long)cnt[l] * s[l];
         result += (base[l] * x * y) / 10000;

         cnt[l]++;
         combo++;
      }

      System.out.println(result);
    }
}