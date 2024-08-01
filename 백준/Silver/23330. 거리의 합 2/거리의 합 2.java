import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      StringTokenizer st = new StringTokenizer(br.readLine());

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(st.nextToken());
      }

      Arrays.sort(arr);

      long sum = 0;

      for (int i = 0; i < n - 1; i++) {
         sum += (long)(i + 1) * (long)(n - i - 1) * (arr[i + 1] - arr[i]);
      }

      System.out.println(sum * 2);
   }
}
