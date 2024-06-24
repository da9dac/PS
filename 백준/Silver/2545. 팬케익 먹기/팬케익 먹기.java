import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      StringBuilder sb = new StringBuilder();

      int t = Integer.parseInt(br.readLine());

      while (t-- > 0) {
         br.readLine();
         st = new StringTokenizer(br.readLine());

         long[] arr = new long[3];

         for (int i = 0; i < 3; i++) arr[i] = Long.parseLong(st.nextToken());

         Arrays.sort(arr);

         long a = arr[0];
         long b = arr[1];
         long c = arr[2];
         long d = Long.parseLong(st.nextToken());

         long sum = a + b + c - d;

         a = Math.min(sum / 3, a);
         sum -= a;
         b = Math.min(sum / 2, b);
         sum -= b;
         c = sum;

         sb.append(a * b * c).append("\n");
      }

      System.out.println(sb);
   }
}
