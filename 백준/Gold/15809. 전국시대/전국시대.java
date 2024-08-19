import java.io.*;
import java.util.*;

class Main {

   static int n;
   static int[] parents, powers;

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());

      n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());

      powers = new int[n + 1];
      parents = new int[n + 1];

      for (int i = 1; i <= n; i++) {
         powers[i] = Integer.parseInt(br.readLine());
         parents[i] = i;
      }

      while (m-- > 0) {
         st = new StringTokenizer(br.readLine());

         int o = Integer.parseInt(st.nextToken());
         int p = Integer.parseInt(st.nextToken());
         int q = Integer.parseInt(st.nextToken());

         if (o == 2) {
            int x = find(p);
            int y = find(q);

            int xp = powers[x];
            int yp = powers[y];

            if (xp > yp) {
               powers[y] = 0;
               powers[x] -= yp;
            } else if (xp < yp) {
               powers[x] = 0;
               powers[y] -= xp;
            } else {
               powers[x] = 0;
               powers[y] = 0;
            }
         }
         
         union(p, q);
      }

      PriorityQueue<Integer> pq = new PriorityQueue<>();

      for (int i = 1; i <= n; i++) {
         if (powers[i] != 0) pq.offer(powers[i]);
      }

      StringBuilder sb = new StringBuilder();

      sb.append(pq.size()).append("\n");

      while (!pq.isEmpty()) {
         sb.append(pq.poll()).append(" ");
      }

      System.out.println(sb);
   }

   static void union(int a, int b) {
      int x = find(a);
      int y = find(b);

      if (x == y) return;

      if (x <= y) {
         powers[x] += powers[y];
         powers[y] = 0;
         parents[y] = x;
      } else {
         powers[y] += powers[x];
         powers[x] = 0;
         parents[x] = y;
      }
   }

   static int find(int cur) {
      return parents[cur] == cur ? cur : find(parents[cur]);
   }
}